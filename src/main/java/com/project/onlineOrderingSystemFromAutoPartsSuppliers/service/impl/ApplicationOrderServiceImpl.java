package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.impl;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationOrder;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository.ApplicationOrderRepository;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.ApplicationOrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationOrderServiceImpl implements ApplicationOrderService {
    private ApplicationOrderRepository applicationOrderRepository;

    @Override
    public List<ApplicationOrder> getAllOrders() {
        return applicationOrderRepository.findAll();
    }

    @Override
    public ApplicationOrder getApplicationOrderById(Long id) {
        return applicationOrderRepository.findById(id).orElse(null);
    }

    @Override
    public List<ApplicationOrder> getApplicationOrderByUserId(Long userId) {
        return applicationOrderRepository.getApplicationOrderItemByUserId(userId);
    }

    @Override
    public ApplicationOrder addOrder(ApplicationOrder applicationOrder) {
        applicationOrderRepository.save(applicationOrder);
        return applicationOrder;
    }

    @Override
    public String updateOrder(ApplicationOrder applicationOrder) {
        applicationOrderRepository.save(applicationOrder);
        return "Successfully updated order!";
    }

    @Override
    public String deleteOrder(Long id) {
        if (!applicationOrderRepository.existsById(id)) {
            return "Order not found";
        }
        applicationOrderRepository.deleteById(id);
        return "Order successfully deleted";
    }
}

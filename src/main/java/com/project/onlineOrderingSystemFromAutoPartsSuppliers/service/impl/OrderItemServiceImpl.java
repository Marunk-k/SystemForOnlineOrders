package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.impl;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.OrderItem;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository.OrderItemRepository;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.OrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {
    private OrderItemRepository orderItemRepository;

    @Override
    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    @Override
    public OrderItem addOrderItem(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
        return orderItem;
    }

    @Override
    public String updateOrderItem(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
        return "Successfully updated order item!";
    }

    @Override
    public String deleteOrderItem(Long id) {
        if (!orderItemRepository.existsById(id)) {
            return "Order item not found";
        }
        orderItemRepository.deleteById(id);
        return "Order item successfully deleted";
    }
}

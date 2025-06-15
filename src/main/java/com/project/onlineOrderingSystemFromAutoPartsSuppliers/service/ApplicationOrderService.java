package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationOrder;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ApplicationOrderService {
    List<ApplicationOrder> getAllOrders();
    ApplicationOrder getApplicationOrderById(Long id);
    List<ApplicationOrder> getApplicationOrderByUserId(Long id);
    ApplicationOrder addOrder(ApplicationOrder applicationOrder);
    String updateOrder(ApplicationOrder applicationOrder);
    String deleteOrder(Long id);
}

package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationOrder;

import java.util.List;

public interface ApplicationOrderService {
    List<ApplicationOrder> getAllOrders();
    ApplicationOrder addOrder(ApplicationOrder applicationOrder);
    String updateOrder(ApplicationOrder applicationOrder);
    String deleteOrder(Long id);
}

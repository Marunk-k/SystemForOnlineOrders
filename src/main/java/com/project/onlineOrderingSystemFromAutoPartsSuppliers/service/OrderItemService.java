package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.OrderItem;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderItemService {
    List<OrderItem> getAllOrderItems();
    OrderItem addOrderItem(OrderItem orderItem);
    String updateOrderItem(OrderItem orderItem);
    String deleteOrderItem(Long id);
}

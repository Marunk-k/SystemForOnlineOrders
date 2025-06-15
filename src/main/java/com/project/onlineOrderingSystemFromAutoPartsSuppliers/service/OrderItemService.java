package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationOrder;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.OrderItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderItemService {
    List<OrderItem> getAllOrderItems();
    List<OrderItem> getOrderItemByOrderId(Long id);
    OrderItem addOrderItem(OrderItem orderItem);
    String updateOrderItem(OrderItem orderItem);
    String deleteOrderItem(Long id);
}

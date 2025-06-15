package com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.OrderItem;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> getOrderItemByOrderId(Long orderId);
}

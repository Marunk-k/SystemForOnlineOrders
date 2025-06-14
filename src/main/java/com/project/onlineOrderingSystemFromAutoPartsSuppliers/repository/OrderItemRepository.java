package com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.OrderItem;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

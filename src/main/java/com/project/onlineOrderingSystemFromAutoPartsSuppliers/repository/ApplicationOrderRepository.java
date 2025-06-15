package com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationOrder;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationOrderRepository extends JpaRepository<ApplicationOrder, Long> {
    List<ApplicationOrder> getApplicationOrderItemByUserId(Long userId);
}

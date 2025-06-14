package com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationOrderRepository extends JpaRepository<ApplicationOrder, Long> {
}

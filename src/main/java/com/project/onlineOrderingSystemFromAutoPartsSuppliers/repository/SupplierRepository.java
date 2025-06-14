package com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Role;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}

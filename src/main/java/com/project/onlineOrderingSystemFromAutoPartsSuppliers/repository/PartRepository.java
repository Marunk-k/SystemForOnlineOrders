package com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Part;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Long> {
}

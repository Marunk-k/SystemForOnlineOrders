package com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    Optional<ApplicationUser> findByEmailAndPassword(String email, String password);

    Optional<ApplicationUser> findByPhoneAndPassword(String phone, String password);
}

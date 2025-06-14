package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role addRole(Role role);
    String updateRole(Role role);
    String deleteRole(Long id);
}

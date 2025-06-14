package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.impl;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Role;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository.RoleRepository;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role addRole(Role role) {
        roleRepository.save(role);
        return role;
    }

    @Override
    public String updateRole(Role role) {
        roleRepository.save(role);
        return "Successfully updated user!";
    }

    @Override
    public String deleteRole(Long id) {
        if (!roleRepository.existsById(id)) {
            return "Role not found";
        }
        roleRepository.deleteById(id);
        return "Role successfully deleted";
    }
}

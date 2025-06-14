package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationUser;

import java.util.List;

public interface ApplicationUserService {
    List<ApplicationUser> getAllApplicationUsers();
    ApplicationUser isUserExist(String login, String password);
    ApplicationUser addApplicationUser(ApplicationUser applicationUser);
    String updateApplicationUser(ApplicationUser applicationUser);
    String deleteApplicationUser(Long id);
}

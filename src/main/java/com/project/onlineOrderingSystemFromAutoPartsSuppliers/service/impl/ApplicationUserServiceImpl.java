package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.impl;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationUser;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository.ApplicationUserRepository;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.ApplicationUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ApplicationUserServiceImpl implements ApplicationUserService {
    private ApplicationUserRepository applicationUserRepository;

    @Override
    public List<ApplicationUser> getAllApplicationUsers() {
        return applicationUserRepository.findAll();
    }

    @Override
    public ApplicationUser isUserExist(String login, String password) {
        Optional<ApplicationUser> user = applicationUserRepository.findByEmailAndPassword(login, password);
        if (user.isPresent()) {
            return user.get();
        } else {
            user = applicationUserRepository.findByPhoneAndPassword(login, password);
            if (user.isPresent()) {
                return user.get();
            }
        }
        return null;
    }

    @Override
    public ApplicationUser addApplicationUser(ApplicationUser appUser) {
        applicationUserRepository.save(appUser);
        return appUser;
    }

    @Override
    public String updateApplicationUser(ApplicationUser appUser) {
        applicationUserRepository.save(appUser);
        return "Successfully updated application user!";
    }

    @Override
    public String deleteApplicationUser(Long id) {
        if (!applicationUserRepository.existsById(id)) {
            return "Application user not found";
        }
        applicationUserRepository.deleteById(id);
        return "Application user successfully deleted";
    }
}

package com.project.onlineOrderingSystemFromAutoPartsSuppliers.controller;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationUser;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.ApplicationUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/application_user")
@RestController
@AllArgsConstructor
public class ApplicationUserController {
    private final ApplicationUserService applicationUserService;

    @GetMapping("/getAll")
    public List<ApplicationUser> getAllApplicationUsers() {

        return applicationUserService.getAllApplicationUsers();
    }

    @GetMapping("/isUserExist/{login}/{password}")
    public ApplicationUser isUserExist(@PathVariable String login, @PathVariable String password) {
        return applicationUserService.isUserExist(login, password);
    }

    @PostMapping("/add")
    public ApplicationUser addApplicationUser(@RequestBody ApplicationUser applicationUser) {
        applicationUserService.addApplicationUser(applicationUser);
        return applicationUser;
    }

    @PutMapping("/update")
    public String updateApplicationUser(@RequestBody ApplicationUser applicationUser) {
        applicationUserService.updateApplicationUser(applicationUser);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteApplicationUser(@PathVariable Long id) {
        applicationUserService.deleteApplicationUser(id);
        return "Success";
    }
}

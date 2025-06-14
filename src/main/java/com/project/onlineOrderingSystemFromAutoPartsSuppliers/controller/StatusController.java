package com.project.onlineOrderingSystemFromAutoPartsSuppliers.controller;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Status;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.StatusService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/status")
@RestController
@AllArgsConstructor
public class StatusController {
    private final StatusService statusService;

    @GetMapping("/getAll")
    public List<Status> getAllStatuses() {
        return statusService.getAllStatuses();
    }

    @PostMapping("/add")
    public Status addStatus(@RequestBody Status status) {
        statusService.addStatus(status);
        return status;
    }

    @PutMapping("/update")
    public String updateStatus(@RequestBody Status status) {
        statusService.updateStatus(status);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStatus(@PathVariable Long id) {
        statusService.deleteStatus(id);
        return "Success";
    }
}

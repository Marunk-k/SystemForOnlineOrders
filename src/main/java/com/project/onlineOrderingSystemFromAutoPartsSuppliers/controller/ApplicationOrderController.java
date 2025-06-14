package com.project.onlineOrderingSystemFromAutoPartsSuppliers.controller;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.ApplicationOrder;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.ApplicationOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/application_order")
@RestController
@AllArgsConstructor
public class ApplicationOrderController {
    private final ApplicationOrderService applicationOrderService;

    @GetMapping("/getAll")
    public List<ApplicationOrder> getAllOrders() {
        return applicationOrderService.getAllOrders();
    }

    @PostMapping("/add")
    public ApplicationOrder addOrder(@RequestBody ApplicationOrder applicationOrder) {
        applicationOrderService.addOrder(applicationOrder);
        return applicationOrder;
    }

    @PutMapping("/update")
    public String updateOrder(@RequestBody ApplicationOrder applicationOrder) {
        applicationOrderService.updateOrder(applicationOrder);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        applicationOrderService.deleteOrder(id);
        return "Success";
    }
}

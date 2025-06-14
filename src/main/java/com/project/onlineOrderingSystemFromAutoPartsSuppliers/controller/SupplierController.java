package com.project.onlineOrderingSystemFromAutoPartsSuppliers.controller;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Supplier;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/supplier")
@RestController
@AllArgsConstructor
public class SupplierController {
    private final SupplierService supplierService;

    @GetMapping("/getAll")
    public List<Supplier> getAllSuppliers() {

        return supplierService.getAllSuppliers();
    }

    @PostMapping("/add")
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        supplierService.addSupplier(supplier);
        return supplier;
    }

    @PutMapping("/update")
    public String updateSupplier(@RequestBody Supplier supplier) {
        supplierService.updateSupplier(supplier);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSupplier(@PathVariable Long id) {
        supplierService.deleteSupplier(id);
        return "Success";
    }
}

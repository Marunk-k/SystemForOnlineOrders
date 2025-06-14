package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.impl;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Supplier;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository.SupplierRepository;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier addSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
        return supplier;
    }

    @Override
    public String updateSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
        return "Successfully updated supplier!";
    }

    @Override
    public String deleteSupplier(Long id) {
        if (!supplierRepository.existsById(id)) {
            return "Supplier not found";
        }
        supplierRepository.deleteById(id);
        return "Supplier successfully deleted";
    }
}

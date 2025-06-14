package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> getAllSuppliers();
    Supplier addSupplier(Supplier supplier);
    String updateSupplier(Supplier supplier);
    String deleteSupplier(Long id);
}

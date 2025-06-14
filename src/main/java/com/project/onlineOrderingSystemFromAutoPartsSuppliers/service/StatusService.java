package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Status;

import java.util.List;

public interface StatusService {
    List<Status> getAllStatuses();
    Status addStatus(Status status);
    String updateStatus(Status status);
    String deleteStatus(Long id);
}

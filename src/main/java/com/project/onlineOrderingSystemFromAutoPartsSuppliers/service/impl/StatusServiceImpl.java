package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.impl;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Status;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository.StatusRepository;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.StatusService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StatusServiceImpl implements StatusService {
    private StatusRepository statusRepository;

    @Override
    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }

    @Override
    public Status addStatus(Status Status) {
        statusRepository.save(Status);
        return Status;
    }

    @Override
    public String updateStatus(Status Status) {
        statusRepository.save(Status);
        return "Successfully updated status!";
    }

    @Override
    public String deleteStatus(Long id) {
        if (!statusRepository.existsById(id)) {
            return "Status not found";
        }
        statusRepository.deleteById(id);
        return "Status successfully deleted";
    }
    
}

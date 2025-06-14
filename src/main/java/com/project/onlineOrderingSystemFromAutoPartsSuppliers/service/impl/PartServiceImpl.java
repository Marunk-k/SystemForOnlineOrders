package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.impl;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Part;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.repository.PartRepository;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.PartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PartServiceImpl implements PartService {
    private PartRepository partRepository;

    @Override
    public List<Part> getAllParts() {
        return partRepository.findAll();
    }

    @Override
    public Part addPart(Part part) {
        partRepository.save(part);
        return part;
    }

    @Override
    public String updatePart(Part part) {
        partRepository.save(part);
        return "Successfully updated part!";
    }

    @Override
    public String deletePart(Long id) {
        if (!partRepository.existsById(id)) {
            return "Part not found";
        }
        partRepository.deleteById(id);
        return "Part successfully deleted";
    }
}

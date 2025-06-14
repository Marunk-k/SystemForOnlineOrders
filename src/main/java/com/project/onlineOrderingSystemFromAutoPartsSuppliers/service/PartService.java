package com.project.onlineOrderingSystemFromAutoPartsSuppliers.service;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Part;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PartService {
    List<Part> getAllParts();
    Part addPart(Part part);
    String updatePart(Part part);
    String deletePart(Long id);
}

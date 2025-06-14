package com.project.onlineOrderingSystemFromAutoPartsSuppliers.controller;

import com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity.Part;
import com.project.onlineOrderingSystemFromAutoPartsSuppliers.service.PartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/part")
@RestController
@AllArgsConstructor
public class PartController {
    private final PartService partService;

    @GetMapping("/getAll")
    public List<Part> getAllParts() {

        return partService.getAllParts();
    }

    @PostMapping("/add")
    public Part addPart(@RequestBody Part part) {
        partService.addPart(part);
        return part;
    }

    @PutMapping("/update")
    public String updatePart(@RequestBody Part part) {
        partService.updatePart(part);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deletePart(@PathVariable Long id) {
        partService.deletePart(id);
        return "Success";
    }
}

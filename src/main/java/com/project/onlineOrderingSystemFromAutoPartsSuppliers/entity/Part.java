package com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "part")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "article", nullable = false)
    private Integer article;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false, unique = true)
    private Float price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "supplier_id", nullable = false)
    private Integer supplierId;

}

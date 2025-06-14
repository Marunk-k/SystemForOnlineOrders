package com.project.onlineOrderingSystemFromAutoPartsSuppliers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "application_order")
public class ApplicationOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "total_amount", nullable = false)
    private Float totalAmount;

    @Column(name = "status_id", nullable = false)
    private Integer statusId;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}

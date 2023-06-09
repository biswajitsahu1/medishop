package com.medishop.Medicines.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

public class MedicineDto {

    private String medicineId;

    @NotEmpty(message = "Medicine name should not empty")
    private String name;

    @NotEmpty(message = "Medicine description should not empty")
    private String description;


    private String category;

    private String brand;

    private String dosage;

    @NotEmpty(message = "Medicine price should not empty")
    private int price;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    @NotEmpty(message = "Medicine quantity should not empty")
    private int quantity;
}

package com.medishop.order.entites;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Medicine {

    private String medicineId;

    private String name;

    private String description;

    private String category;

    private String brand;

    private String dosage;

    private int price;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    private int quantity;
}

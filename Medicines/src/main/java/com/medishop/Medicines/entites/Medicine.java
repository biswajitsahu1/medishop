package com.medishop.Medicines.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "medicines")
public class Medicine {

    @Id
    private String medicineId;

    @Column(nullable = false)
    @NotEmpty(message = "Medicine name should not empty")
    private String name;

    @Lob
    @Column(nullable = false)
    @NotEmpty(message = "Medicine description should not empty")
    private String description;


    private String category;

    private String brand;

    private String dosage;

    @Column(nullable = false)
    @NotEmpty(message = "Medicine price should not empty")
    private int price;

    @CreationTimestamp
    private LocalDateTime createdOn;
    @UpdateTimestamp
    private LocalDateTime updatedOn;

    @Column(nullable = false)
    @NotEmpty(message = "Medicine quantity should not empty")
    private int quantity;
}

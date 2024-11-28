package com.healthsync.pr_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "prescriptions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String medication; // e.g., "Metformin"

    @Column(nullable = false)
    private String dosage; // e.g., "500 mg twice daily"

    private String prescribingDoctor;

    @Column(nullable = false)
    private String prescriptionDate;

    // Many-to-One relationship with Patient
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
}
package com.healthsync.pr_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "medical_history")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String condition; // e.g., "Diabetes"

    private String description; // e.g., "Type 2 Diabetes, diagnosed in 2015"

    @Column(nullable = false)
    private String diagnosedDate; // Store as a string or LocalDate

    // Many-to-One relationship with Patient
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
}
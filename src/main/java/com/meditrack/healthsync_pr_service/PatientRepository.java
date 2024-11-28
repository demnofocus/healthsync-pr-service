package com.meditrack.healthsync_pr_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.meditrack.healthsync_pr_service.Patient;

@Repository
public interface PatientRepository extends  JpaRepository <Patient, Long> {

}

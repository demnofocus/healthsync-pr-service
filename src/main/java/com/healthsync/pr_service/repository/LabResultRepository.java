package com.healthsync.pr_service.repository;

import com.healthsync.pr_service.entity.LabResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabResultRepository extends JpaRepository<LabResult, Long> {

}

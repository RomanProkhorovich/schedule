package com.example.schedule.repository;

import com.example.schedule.model.EducationalInstitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducationInstitutionRepository extends JpaRepository<EducationalInstitution,Long> {
    Optional<EducationalInstitution> findByName(String name);
}

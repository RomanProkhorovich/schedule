package com.example.schedule.repository;

import com.example.schedule.model.EducationalInstitution;
import com.example.schedule.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findByEducationalInstitution(EducationalInstitution institution);
}

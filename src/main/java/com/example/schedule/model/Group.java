package com.example.schedule.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "un_group")
public class Group {
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ed_inst_id", nullable = false)
    private EducationalInstitution educationalInstitution;

    @Column(nullable = false)
    private String name;

}
package com.example.schedule.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EducationalInstitution {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    @Builder.Default
    private String country="Russia";

    @Column(nullable = false)
    private String city;

    @Column(nullable = false,unique = true)
    private String name;


}

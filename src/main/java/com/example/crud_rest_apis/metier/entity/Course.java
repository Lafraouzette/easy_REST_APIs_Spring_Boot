package com.example.crud_rest_apis.metier.entity;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Génération automatique de l'ID
    private Long id;


    private String name;


    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;
    
    @ManyToOne
    @JoinColumn(name = "prof_id")
    private Prof prof;
}

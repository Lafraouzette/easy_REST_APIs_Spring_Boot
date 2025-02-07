package com.example.crud_rest_apis.metier.entity;

import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student extends User{
    
    private int lvl; 

    public int getlvl() {
        return this.lvl;
    }

    public void setlvl(int lvl) {
        this.lvl = lvl;
    }

    @ManyToMany
    @JoinTable(
        name = "student_course", // Nom de la table de jointure
        joinColumns = @JoinColumn(name = "student_id"), // Colonne pour l'ID de l'étudiant
        inverseJoinColumns = @JoinColumn(name = "course_id") // Colonne pour l'ID du cours
    )
    private Set<Course> courses;
}

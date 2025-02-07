package com.example.crud_rest_apis.metier.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity

public class Prof extends User {

    private String specialite;

    public String getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(String Specialite) {
        this.specialite = Specialite;
    }

    @OneToMany(mappedBy = "prof", fetch = FetchType.LAZY)// mappedBy Indique que l'autre entité gère la table de jointure
    // via lattribut prof
    private Set<Course> Courses;
}

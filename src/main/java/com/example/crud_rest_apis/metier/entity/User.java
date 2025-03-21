package com.example.crud_rest_apis.metier.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Inheritance(strategy = InheritanceType.JOINED)

public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id ;

    private String name; 
    private String email;  

    @Enumerated(EnumType.STRING)
    private Role role;
    
}

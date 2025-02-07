package com.example.crud_rest_apis.DAO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.crud_rest_apis.metier.entity.User;

@RepositoryRestResource(path = "users") // Assure-toi que l'URL est correcte
public interface UserRepository extends JpaRepository<User, Long> {
  
}


package com.example.crud_rest_apis.DAO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.crud_rest_apis.metier.entity.Course;

@RepositoryRestResource(path = "courses")
public interface CourseRepository extends JpaRepository <Course, Long>{
    
}

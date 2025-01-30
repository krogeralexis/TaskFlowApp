package com.kroger.taskFlow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kroger.taskFlow.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    // Encuentra todos los proyectos en los que participa un usuario dado
    List<Project> findByMembers_Id(Long userId);
}

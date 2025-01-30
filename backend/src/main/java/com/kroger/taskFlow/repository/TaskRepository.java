package com.kroger.taskFlow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kroger.taskFlow.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Encuentra todas las tareas asociadas a un proyecto
    List<Task> findByProject_Id(Long projectId);

    // Encuentra todas las tareas asignadas a un usuario
    List<Task> findByAssignee_Id(Long userId);
}

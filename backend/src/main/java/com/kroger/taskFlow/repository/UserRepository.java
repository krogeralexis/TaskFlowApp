package com.kroger.taskFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kroger.taskFlow.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Encuentra un usuario por su correo electrónico
    User findByEmail(String email);

    // Verifica si existe un usuario con el correo dado
    boolean existsByEmail(String email);
}

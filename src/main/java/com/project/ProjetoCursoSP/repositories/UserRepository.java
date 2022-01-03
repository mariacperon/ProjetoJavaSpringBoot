package com.project.ProjetoCursoSP.repositories;

import com.project.ProjetoCursoSP.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

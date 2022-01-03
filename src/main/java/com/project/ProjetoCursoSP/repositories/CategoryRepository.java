package com.project.ProjetoCursoSP.repositories;

import com.project.ProjetoCursoSP.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

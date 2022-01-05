package com.project.ProjetoCursoSP.repositories;

import com.project.ProjetoCursoSP.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

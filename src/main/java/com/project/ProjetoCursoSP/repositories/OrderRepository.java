package com.project.ProjetoCursoSP.repositories;

import com.project.ProjetoCursoSP.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

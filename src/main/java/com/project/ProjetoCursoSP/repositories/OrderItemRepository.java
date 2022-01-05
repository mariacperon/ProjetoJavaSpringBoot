package com.project.ProjetoCursoSP.repositories;

import com.project.ProjetoCursoSP.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

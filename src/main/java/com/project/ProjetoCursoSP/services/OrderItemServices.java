package com.project.ProjetoCursoSP.services;

import com.project.ProjetoCursoSP.entities.OrderItem;
import com.project.ProjetoCursoSP.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemServices {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll(){
        return orderItemRepository.findAll();
    }

    public OrderItem findById(Long id){
        Optional<OrderItem> obj = orderItemRepository.findById(id);
        return obj.get();
    }
}

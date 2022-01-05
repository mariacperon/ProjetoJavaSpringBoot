package com.project.ProjetoCursoSP.resources;

import com.project.ProjetoCursoSP.entities.OrderItem;
import com.project.ProjetoCursoSP.services.OrderItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orderitems")
public class OrderItemResources {

    @Autowired
    private OrderItemServices orderItemServices;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll(){
        List<OrderItem> list = orderItemServices.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Long id){
        OrderItem obj = orderItemServices.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}

package com.project.ProjetoCursoSP.resources;

import com.project.ProjetoCursoSP.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria Clara", "maria@gmailcom", "47996529936", "1234");
        return ResponseEntity.ok().body(u);
    }

}

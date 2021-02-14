package com.pedro.curso.resources;

import com.pedro.curso.entities.Client;
import com.pedro.curso.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientResource {

    @Autowired
    ClientService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> show(@PathVariable Long id) {
        Client client = service.find(id);
        return ResponseEntity.ok().body(client);
    }
}

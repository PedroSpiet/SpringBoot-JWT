package com.pedro.curso.services;

import com.pedro.curso.entities.Client;
import com.pedro.curso.repositories.ClientRepository;
import com.pedro.curso.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client find(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.orElseThrow(() -> new ObjectNotFoundException("Usuario não encontrado!"));
    }
}

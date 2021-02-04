package com.pedro.curso.repositories;

import com.pedro.curso.entities.City;
import com.pedro.curso.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}

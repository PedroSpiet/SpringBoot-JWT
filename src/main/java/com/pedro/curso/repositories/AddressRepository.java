package com.pedro.curso.repositories;

import com.pedro.curso.entities.Address;
import com.pedro.curso.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}

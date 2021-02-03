package com.pedro.curso.repositories;

import com.pedro.curso.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}

package com.pedro.curso.repositories;

import com.pedro.curso.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}

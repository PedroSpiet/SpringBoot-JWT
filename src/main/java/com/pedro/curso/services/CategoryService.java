package com.pedro.curso.services;

import com.pedro.curso.entities.Category;
import com.pedro.curso.repositories.CategoriesRepository;
import com.pedro.curso.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoriesRepository repo;

    public Category getCategory(Long id) {
        Optional<Category> category = repo.findById(id);
        return category.orElseThrow(() -> new ObjectNotFoundException("Usuario não encontrado!"));
    }
}

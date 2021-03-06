package com.pedro.curso.resources;

import com.pedro.curso.entities.Category;
import com.pedro.curso.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> index() {
        List<Category> categories = service.listAll();
        return ResponseEntity.ok().body(categories);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Category> getCategorie(@PathVariable Long id) {
        Category category = service.getCategory(id);
        return ResponseEntity.ok().body(category);
    }
}

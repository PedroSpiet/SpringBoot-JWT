package com.pedro.curso.resources;

import com.pedro.curso.entities.Categories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoriesResource {

    @GetMapping
    public ResponseEntity<List<Categories>> getCategories() {
        Categories categorie = new Categories(null, "Banana fish");
        Categories categorie2 = new Categories(null, "maçã fish");

        List<Categories> categories = new ArrayList<>();
        categories.add(categorie);
        categories.add(categorie2);

        return ResponseEntity.ok().body(categories);
    }
}

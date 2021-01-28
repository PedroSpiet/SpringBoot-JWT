package com.pedro.curso.config;

import com.pedro.curso.entities.Category;
import com.pedro.curso.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class InstanceDB implements CommandLineRunner {

    @Autowired
    private CategoriesRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category category1 = new Category(null, "categoria1");
        Category category2 = new Category(null, "categoria2");
        Category category3 = new Category(null, "categoria3");

        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
    }
}

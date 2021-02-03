package com.pedro.curso.config;

import com.pedro.curso.entities.Category;
import com.pedro.curso.entities.City;
import com.pedro.curso.entities.Product;
import com.pedro.curso.entities.State;
import com.pedro.curso.repositories.CategoriesRepository;
import com.pedro.curso.repositories.CityRepository;
import com.pedro.curso.repositories.ProductRepository;
import com.pedro.curso.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class InstanceDB implements CommandLineRunner {

    @Autowired
    private CategoriesRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void run(String... args) throws Exception {
        Category category1 = new Category(null, "categoria1");
        Category category2 = new Category(null, "categoria2");

        Product product1 = new Product(null, "Televisão", 200.00);
        Product product2 = new Product(null, "MicroOndas", 20.00);
        Product product3 = new Product(null, "Carro", 10.000);

        category1.getProducts().addAll(Arrays.asList(product1, product2));
        category2.getProducts().addAll(Arrays.asList(product3));

        product1.getCategories().addAll(Arrays.asList(category1));
        product2.getCategories().addAll(Arrays.asList(category1));
        product3.getCategories().addAll(Arrays.asList(category2));

        State state1 = new State(null, "São Paulo");
        State state2 = new State(null, "Minas Gerais");

        City city1 = new City(null, "Itanhaém", state1);
        City city2 = new City(null, "Belo Horizonte", state2);

        state1.getCities().addAll(Arrays.asList(city1));
        state2.getCities().addAll(Arrays.asList(city2));

        stateRepository.saveAll(Arrays.asList(state1, state2));
        cityRepository.saveAll(Arrays.asList(city1, city2));

        categoryRepository.saveAll(Arrays.asList(category1, category2));
        productRepository.saveAll(Arrays.asList(product1, product2, product3));
    }
}

package com.pedro.curso.config;

import com.pedro.curso.entities.*;
import com.pedro.curso.repositories.*;
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

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AddressRepository addressRepository;

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

        Client c1 = new Client(null, "Maria", "Maria@gmail.com", "123456", TypeClient.PhysicalPerson);
        c1.getTelephones().addAll(Arrays.asList("13996403088", "13996403089"));

        Address ad1 = new Address(null, "Rua Flores", 300, "Apto 230", "Jardim", "4564484", c1, city1);
        Address ad2 = new Address(null, "Rua Matos", 300, "Apto 230", "Renato Dias", "45123284", c1, city2);

        c1.getAddresses().addAll(Arrays.asList(ad1, ad2));

        clientRepository.saveAll(Arrays.asList(c1));
        addressRepository.saveAll(Arrays.asList(ad1, ad2));
    }
}

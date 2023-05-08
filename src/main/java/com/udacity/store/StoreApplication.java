package com.udacity.store;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.nio.file.Files;


@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

    @Autowired
     ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("Notebook", "Aesthetic Spiral Notebook Journal", 9, "https://m.media-amazon.com/images/I/71SCL5fRCBL._AC_SX466_.jpg"));
        //log.info("adddddd");
        productRepository.save(new Product("Lined Notebook", "Paper Hardcover Lined Journal Notebook", 14, "https://m.media-amazon.com/images/I/91YVbtae5KL._AC_SY741_.jpg"));

    }
}

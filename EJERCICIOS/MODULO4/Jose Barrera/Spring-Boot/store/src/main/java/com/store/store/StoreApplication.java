package com.store.store;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.store.store.entities.Product;
import com.store.store.repositories.ProductRepository;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(ProductRepository repo) {
		return (evt) -> {
			repo.insert(new Product("PSP", 2399, "Consoles"));
			repo.insert(new Product("PSVita", 4000, "Consoles"));
		};
	}
}

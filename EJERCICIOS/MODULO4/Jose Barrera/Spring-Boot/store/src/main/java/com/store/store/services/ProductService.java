package com.store.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.store.entities.Product;
import com.store.store.repositories.ProductRepositoryInterface;;

@Service
public class ProductService implements ProductInterface{
	
	@Autowired
	ProductRepositoryInterface productRepository;
	
	@Override
	public List<Product> Products() {
		return productRepository.findAll();
	}

	@Override
	public int NumberProducts() {
		return productRepository.findAll().size();
	}

	@Override
	public Product AddProduct(Product p) {
		return productRepository.insert(p);
	}

	@Override
	public Product UpdateProduct(Product p) {
		return productRepository.update(p);
	}

	@Override
	public void RemoveProduct(int id) {
		productRepository.delete(id);
	}

	
}

package com.store.store.repositories;

import java.util.List;

import com.store.store.entities.Product;

public interface ProductRepositoryInterface {
	public List<Product> findAll();
	public Product findByName(String name);
	public Product insert(Product product);
	public Product update(Product product);
	public void delete(int id);
}

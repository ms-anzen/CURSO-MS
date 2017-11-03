package com.store.store.services;

import java.util.List;

import com.store.store.entities.Product;

public interface ProductInterface {
	public List<Product> Products();
	public int NumberProducts();
	public Product AddProduct(Product p);
	public Product UpdateProduct(Product p);
	public void RemoveProduct(int id);
}

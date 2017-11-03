package com.store.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.store.entities.Product;
import com.store.store.services.ProductInterface;

@RestController
public class ProductController {
	
	@Autowired
	ProductInterface pint;
	
	@RequestMapping(path="/product", method=RequestMethod.GET)
	public List<Product> list(){
		return pint.Products();
	}
	
	@RequestMapping(path="/product/add", method=RequestMethod.GET)
	public Product add(@RequestParam(value="name", required=true) String name, 
						@RequestParam(value="price", required=true) int price, 
						@RequestParam(value="category", required=true) String category) {
		return pint.AddProduct(new Product(name, price, category));
	}
	
	@RequestMapping(path="/product/update", method=RequestMethod.GET)
	public Product update(@RequestParam(value="name", required=true) String name, 
						@RequestParam(value="price", required=true) int price, 
						@RequestParam(value="category", required=true) String category) {
		return pint.UpdateProduct(new Product(name, price, category));
	}
	
	@RequestMapping(path="/product/remove", method=RequestMethod.GET)
	public Product remove(@RequestParam(value="name", required=true) String name, 
						@RequestParam(value="price", required=true) int price, 
						@RequestParam(value="category", required=true) String category) {
		return pint.AddProduct(new Product(name, price, category));
	}
	
	@RequestMapping(path="/products/count")
	public int count() {
		return pint.NumberProducts();
	}
	
}

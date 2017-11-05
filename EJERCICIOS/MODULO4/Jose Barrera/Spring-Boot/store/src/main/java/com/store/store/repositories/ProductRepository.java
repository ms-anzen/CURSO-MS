package com.store.store.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.store.store.entities.Product;
import com.store.store.entities.ProductBean;
import com.store.store.repositories.ProductRepositoryInterface;;

@Repository
public class ProductRepository implements ProductRepositoryInterface{
	
	@Autowired
	ApplicationContext context;
	
	@Override
	public List<Product> findAll() {
		return context.getBean(ProductBean.class).getDb();
	}

	@Override
	public Product findByName(String name) {
		List<Product> products = context.getBean(ProductBean.class).getDb();
		for(Product p : products)
			if(p.getName().equals(name))
				return p;
		return null;
	}

	@Override
	public Product insert(Product product) {
		return context.getBean(ProductBean.class).addItem(product);
	}
	@Override
	
	public Product update(Product product) {
		return context.getBean(ProductBean.class).updateItem(product);
	}

	@Override
	public void delete(int id) {
		context.getBean(ProductBean.class).deleteItem(id);
	}
	
}

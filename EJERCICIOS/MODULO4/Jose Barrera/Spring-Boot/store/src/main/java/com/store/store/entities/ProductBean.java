package com.store.store.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductBean {
	private List<Product> db = new ArrayList<>();

	public List<Product> getDb() {
		return db;
	}

	public void setDb(List<Product> db) {
		this.db = db;
	}
	
	public Product addItem(Product p) {
		if(db.size() > 0) {
			if(!db.contains(p)) {
				p.setId(db.get(db.size() - 1).getId() + 1);
				db.add(p);
				return p;
			}
		} else {
			p.setId(0);
			db.add(p);
		}
		return null;
	}
	
	public Product updateItem(Product p) {
		for(Product product : db) {
			if(p.getName().equals(product.getName())) {
				p.setId(product.getId());
				db.set(product.getId(), p);
			}
		}
		return null;
	}
	
	public void deleteItem(int id) {
		db.remove(id);
	}
}

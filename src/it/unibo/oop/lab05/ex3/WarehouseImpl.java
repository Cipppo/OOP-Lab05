package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class WarehouseImpl implements Warehouse {
	
	private final Set<Product> products = new LinkedHashSet<Product>();

	
	@Override
	public void addProduct(Product p) {
		this.products.add(p);
	}

	@Override
	public Set<String> allNames() {
		
		Set<String> names = new LinkedHashSet<>();
		Iterator<Product> iterator = this.products.iterator();
		
		while(iterator.hasNext()) {
			names.add(iterator.next().getName());
		}
		
		return names;
	}

	@Override
	public Set<Product> allProducts() {
		return this.products;
	}

	@Override
	public boolean containsProduct(Product p) {
		return this.products.contains(p);
	}

	@Override
	public double getQuantity(String name) {
	
		Iterator<Product> iterator = this.products.iterator();
		while(iterator.hasNext()){
			if(iterator.next().getName() == name) {
				return iterator.next().getQuantity();
			}
		}
		return -1;
	}

}

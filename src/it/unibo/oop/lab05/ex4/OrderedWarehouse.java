package it.unibo.oop.lab05.ex4;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class OrderedWarehouse extends WarehouseImpl{
	
	
	@Override
	public Set<Product> allProducts() {
		
		Set<Product> products = super.allProducts();
		Set<Product> ordered_products = new TreeSet<>(new ComparableProduct());
		Iterator <Product> iterator = products.iterator();
		
		while(iterator.hasNext()) {
			ordered_products.add(iterator.next());
		}
		return ordered_products;
	}
	
	
	
}

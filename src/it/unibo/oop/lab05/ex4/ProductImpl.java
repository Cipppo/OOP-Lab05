package it.unibo.oop.lab05.ex4;



public class ProductImpl implements Product, Comparable<Product>{
	
	private final String name;
	private final double quantity;
	
	public ProductImpl(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getQuantity() {
		return this.quantity;
	}


	@Override
	public String toString() {
		return "ProductImpl [name=" + name + ", quantity=" + quantity + "]";
	}


	@Override
	public int compareTo(Product o) {
		return this.name.compareTo(o.getName());
	}



	
	
}

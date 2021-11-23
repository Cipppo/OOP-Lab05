package it.unibo.oop.lab05.ex4;
import java.util.Comparator;


public class ComparableProduct implements Comparator<Product> {


	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().compareTo(o2.getName());
	}


}

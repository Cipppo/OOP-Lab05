package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    

    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	
    	final Set<String> sett = new TreeSet<>();
    	
    	for(int i=1; i <= 20; i++) {
    		sett.add(Integer.toString(i));
    	}
    	
    	System.out.println(sett);
    	final Iterator<String> iterator = sett.iterator();
    	
    	while(iterator.hasNext()) {
    		if(Integer.parseInt(iterator.next()) % 3 == 0) {
    			iterator.remove();
    		}
    	}
    	System.out.println(sett);
    	boolean even = true;
    	
    	for(String i : sett) {
    		System.out.println(i);
    		if(Integer.parseInt(i) % 2 == 1) {
    			even = false;
    		}
    	}
    	
    	if(even) {
    		System.out.println("All the elements are even");
    	}else {
    		System.out.println("Not all the elements are even");
    	}

    	
    }
}

package Lexicon.se.henric.LamdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Interface.Action;
import Interface.Conditional;
import Model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Product> products = Arrays.asList(
    				new Product("pen", 10, 1000),
    				new Product("printer", 5000, 9),
    				new Product("Copy Paper", 149, 200),
    				new Product("paperclip", 1,5)
    			);
    	
    	/*
    	 *TODO: Print out all Products that haves tock value of 0.
    	 *TODO: Print out the product Name of all the Products thats tarts wit hB.
    	 *TODO: Print out all Products that have price above 100 AND lower than 150
    	 *TODO: Increase the priceof all Products that have a stock value of less than 10 AND above 0 by 50%
    	 * */
    	
    	
    }
    
    public List<Product> testConditionAndDoAction(List<Product> products, Conditional conditional, Action a){
    	List<Product> toReturn = new ArrayList<Product>();
    	for(Product product: products) {
    		if(conditional.test(product)) {
    			a.execute(product);
    			toReturn.add(product);
    		}
    	}
    
    	return toReturn;
    }
}

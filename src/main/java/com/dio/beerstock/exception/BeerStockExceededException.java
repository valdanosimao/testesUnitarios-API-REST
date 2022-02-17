package com.dio.beerstock.exception;

public class BeerStockExceededException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6739073113691453852L;
	
	
	public BeerStockExceededException(Long id, int quantityToIncrement) {
        super(String.format("Beers with %s ID to increment informed exceeds the max stock capacity: %s", id, quantityToIncrement));
    }

}

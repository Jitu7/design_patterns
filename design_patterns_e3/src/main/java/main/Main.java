package main;

// Builder Design Pattern
public class Main {

	public static void main(String[] args) {

		Product product = Product.builder().id(10).name("Beer").build();
		Product product2 = Product.builder().id(11).name("Beer2").build();
		Product product3 = Product.builder().id(11).name("Beer2").build();
		
		

	}

}

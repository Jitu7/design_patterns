package main;

// Builder Design Pattern
public class Main {

	public static void main(String[] args) {

		Product product = Product.builder().id(10).name("Beer").build();

	}

}

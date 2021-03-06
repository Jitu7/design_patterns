package main;

import java.math.BigDecimal;

public class Product {

	private int id;
	private String name;
	private BigDecimal price;

	public static class Builder {

		private final Product product = new Product();

		public Builder id(int id) {
			product.id = id;
			return this;
		}

		public Builder name(String name) {
			product.name = name;
			return this;
		}

		public Builder price(BigDecimal price) {
			product.price = price;
			return this;
		}
		
		public Product build() {
			return product;
		}
	}
	
	public static Builder builder() {
		return new Product.Builder();
	}

}

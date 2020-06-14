package com.azhwani;

public final class Product {
	private final int idPoroduct;
	private final String name;
	private final String description;
	private final double price;
	// Our Static variable
	static int counter;

	Product(final int idPoroduct, final String name, final String description, final double price) {
		this.idPoroduct = idPoroduct;
		this.name = name;
		this.description = description;
		this.price = price;
	}


	public static class ProductBuilder {
		private int idPoroduct;
		private String name;
		private String description;
		private double price;

		ProductBuilder() {
		}

		public Product.ProductBuilder idPoroduct(final int idPoroduct) {
			this.idPoroduct = idPoroduct;
			return this;
		}

		public Product.ProductBuilder name(final String name) {
			this.name = name;
			return this;
		}

		public Product.ProductBuilder description(final String description) {
			this.description = description;
			return this;
		}

		public Product.ProductBuilder price(final double price) {
			this.price = price;
			return this;
		}

		public Product build() {
			return new Product(this.idPoroduct, this.name, this.description, this.price);
		}

		@Override
		public String toString() {
			return "Product.ProductBuilder(idPoroduct=" + this.idPoroduct + ", name=" + this.name + ", description=" + this.description + ", price=" + this.price + ")";
		}
	}

	public static Product.ProductBuilder builder() {
		return new Product.ProductBuilder();
	}

	public int getIdPoroduct() {
		return this.idPoroduct;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof Product)) return false;
		final Product other = (Product) o;
		if (this.getIdPoroduct() != other.getIdPoroduct()) return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final Object this$description = this.getDescription();
		final Object other$description = other.getDescription();
		if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
		if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getIdPoroduct();
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $description = this.getDescription();
		result = result * PRIME + ($description == null ? 43 : $description.hashCode());
		final long $price = Double.doubleToLongBits(this.getPrice());
		result = result * PRIME + (int) ($price >>> 32 ^ $price);
		return result;
	}

	@Override
	public String toString() {
		return "Product(idPoroduct=" + this.getIdPoroduct() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", price=" + this.getPrice() + ")";
	}
}

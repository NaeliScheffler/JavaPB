package exercicio_polimorfismo;

public class Product {
	protected String name;
	protected double price;

	public String priceTag() {
		return (name + "$" + price);
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

}

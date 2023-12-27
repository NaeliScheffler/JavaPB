package exercicio_polimorfismo;

import exercicio_polimorfismo.Product;

public class ImportedProduct extends Product {
	private double customsFee;
	private double total;

	@Override
	public String priceTag() {
		return (name + "$" + total + " (Customs Fee: $ " + customsFee + ")");
	}

	public double totalPrice() {
		total = customsFee + price;
		return total;
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

}

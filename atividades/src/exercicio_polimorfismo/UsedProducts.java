package exercicio_polimorfismo;

import java.time.LocalDate;
import java.util.Date;

import exercicio_polimorfismo.Product;

public class UsedProducts extends Product {
	private LocalDate manufactureDate;

	@Override
	public String priceTag() {
		return (name + "$" + price + " (Manufacture Date: $ " + manufactureDate + ")");
	}

	public UsedProducts(String name, double price, LocalDate date) {
		super(name, price);
		this.manufactureDate = date;
	}

}

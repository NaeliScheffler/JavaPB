package att4;

public class CurrencyConverter {
	double dollarPrice;
	double quantity;
	double rs;

	public CurrencyConverter(double dollarPrice, double quantity) {
		this.dollarPrice = dollarPrice;
		this.quantity = quantity;
	}

	public void convert() {
		rs = dollarPrice * quantity;
		dollarPrice = dollarPrice * 0.6;
		rs = rs + dollarPrice;
		System.out.println(rs);
	}
}

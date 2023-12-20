package att4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dollar;
		double quantity;

		System.out.println("What's is the dollar price");
		dollar = sc.nextDouble();

		System.out.println("How many dollars will be bought");
		quantity = sc.nextDouble();

		System.out.println("Amount to be paid in reais = ");
		
		CurrencyConverter cc = new CurrencyConverter(dollar, quantity);
		
		cc.convert();

	}

}

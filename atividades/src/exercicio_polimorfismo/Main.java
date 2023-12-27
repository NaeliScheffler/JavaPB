package exercicio_polimorfismo;

import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import exercicio_polimorfismo.Product;
import exercicio_polimorfismo.UsedProducts;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.println("Enter the number of products:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i) ?");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price :");
			double price = sc.nextDouble();
			if (ch == 'i') {
				System.out.println("Customs Fee :");
				double customsFee = sc.nextDouble();
				list.add(new Product(name, price));

			} else if (ch == 'u') {
				System.out.println("Date :");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProducts(name, price, date));
			} else {
				System.out.print("Import Tax: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}

		}
		System.out.println();
		System.out.println("PRICE TAG:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}

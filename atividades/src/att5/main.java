package att5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int number;
		String initial;
		double depositInit = 0.00;
		double deposit = 0.00;
		double withdraw;

		System.out.println("Enter account number: ");
		number = sc.nextInt();

		System.out.println("Enter account holder: ");
		name = sc.next();

		Account ac = new Account();

		System.out.println("Is there an initial deposit? y/n ");
		initial = sc.next();

		if (initial.equals("y")) {
			System.out.println("Enter initial deposit value ");
			depositInit = sc.nextDouble();
			deposit += depositInit;
		}

		ac.openAccount(number, name, depositInit);
		ac.updated();

		System.out.println("Enter a deposit value: ");
		deposit = sc.nextDouble();

		ac.deposit(deposit);

		System.out.println("Enter a withdraw value: ");
		withdraw = sc.nextDouble();

		ac.withdraw(withdraw);

		sc.close();
	}
}

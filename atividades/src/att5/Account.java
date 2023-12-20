package att5;

public class Account {
	private int number;
	private String name;
	private double deposit = 0.00;

	public String getName() {
		return name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void openAccount(int number, String name, double deposit) {
		this.number = number;
		this.name = name;
		this.deposit = deposit;
	}

	public void deposit(double depositAmount) {
		this.deposit += depositAmount;
		updated();
	}

	public void withdraw(double withdrawAmount) {
		deposit -= (withdrawAmount + 5);
		updated();
	}

	public void updated() {
		System.out.println("Update account data");
		System.out.println("Account " + number + ", Holder: " + name + ", Balance: " + deposit);
	}
}

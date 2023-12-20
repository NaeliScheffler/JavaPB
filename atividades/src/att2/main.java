package att2;


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario;
		double imposto;
		double aumento;
		
		System.out.println("Insira o nome do funcionário:");
		nome = sc.nextLine();
		
		System.out.println("Insira o imposto:");
		imposto = sc.nextDouble();
		
		System.out.println("Insira o salário:");
		salario = sc.nextDouble();
		
		Funcionario f = new Funcionario(nome, salario, imposto);
		
		f.mostrarDados();
		
		System.out.println("Insira o aumento:");
		aumento = sc.nextDouble();
		
		f.calculaAumento(aumento);
		
		f.mostrarDados();
	}

}

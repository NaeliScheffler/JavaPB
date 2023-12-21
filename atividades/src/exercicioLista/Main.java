package exercicioLista;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

		int aux = 0;

		System.out.println("Qual o numero de funcionarios a serem lidos?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Insira o nome do funcionario:");
			String name = sc.next();
			System.out.println("Insira o salario do funcionario:");
			double salario = sc.nextDouble();
			listaFuncionarios.add(new Funcionario(name, salario, i));

		}
		System.out.println("Qual o ID do funcionario a receber aumento?");
		int id = sc.nextInt();
		System.out.println("Qual a porcentagem de aumento?");
		double x = sc.nextDouble();

		for (Funcionario f : listaFuncionarios) {

			if (f.getId() == id) {
				f.aumento(x);
				aux++;
			}
			if (aux == 0) {
				System.out.println("O ID do funcionário nao existe");

			}

		}
		for (Funcionario f : listaFuncionarios) {
			System.out.println("Lista de funcionários:");
			System.out.println(f.getId() + " , " + f.getNome() + " , " + f.getSalario());
		}
		sc.close();

	}

}

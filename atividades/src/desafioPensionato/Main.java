package desafioPensionato;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o número de estudantes que vai alugar quartos?");
		int n = sc.nextInt();

		Pensionato pensionato = new Pensionato();

		if (n > 10) {
			System.out.println("O número de estudantes não pode ser maior que 10.");
			return;
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Insira o nome do estudante " + (i + 1));
			Estudantes estudante = new Estudantes();
			estudante.nome = sc.next();

			System.out.println("Insira o email do estudante " + (i + 1));
			estudante.email = sc.next();
			estudante.quartoEscolhido = i;

			pensionato.registrarAluguel(estudante);
		}
		pensionato.imprimirRelatorio();
	}
}

package exerciciosFixaçãoVetores;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas você vai inserir?");
		int n = sc.nextInt();
		sc.nextLine();

		pessoa[] pessoas = new pessoa[n];

		for (int i = 0; i < n; i++) {
			pessoas[i] = new pessoa();

			System.out.println("Dados da " + (i + 1) + " pessoa:");
			System.out.println("Nome:");
			String name = sc.next();
			pessoas[i].setNome(name);

			System.out.println("Idade:");
			int idade = sc.nextInt();
			pessoas[i].setIdade(idade);

			System.out.println("Altura:");
			double altura = sc.nextDouble();
			pessoas[i].setAltura(altura);
		}

		double somaAlturas = 0;
		int countMenor16 = 0;

		for (int j = 0; j < n; j++) {
			somaAlturas += pessoas[j].getAltura();

			if (pessoas[j].getIdade() < 16) {
				System.out.println("Pessoa com menos de 16 anos: " + pessoas[j].getNome());
				countMenor16++;
			}
		}

		double alturaMedia = somaAlturas / n;
		System.out.println("Altura média das pessoas: " + alturaMedia);

		double porcentagemMenor16 = ((double) countMenor16 / n) * 100;
		System.out.println("Porcentagem de pessoas com menos de 16 anos: " + porcentagemMenor16 + "%");

		sc.close();
	}
}

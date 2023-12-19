package atividadesPB;

import atividadesPB.Rectangle;
import java.util.Scanner;

public class main {
	static double l;
	static double c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a largura do retangulo:");
		l = sc.nextDouble();

		System.out.println("Insira o cumprimento do retangulo:");
		c = sc.nextDouble();

		Rectangle r = new Rectangle();
		
		r.setAtributos(l, c);
		r.areaR();
		r.perimetroR();
		r.diagonalR();

		sc.close();
	}

}

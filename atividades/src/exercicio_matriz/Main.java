package exercicio_matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two integer numbers:");
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter a number for insert a matrix:");
				matrix[i][j] = sc.nextInt();

			}
		}
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					System.out.println("Position: " + i + "," + j + ", Value: " + matrix[i][j]);

					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}

					if (i > 0) {
						System.out.println("Above: " + matrix[i - 1][j]);
					}

					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}

					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
				}
			}

		}
	}
}

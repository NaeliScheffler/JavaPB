package att3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double grade1;
		double grade2;
		double grade3;
		String name;

		System.out.println("Enter the student's name");
		name = sc.nextLine();
		System.out.println("Enter the student's 3 grades");
		grade1 = sc.nextDouble();
		grade2 = sc.nextDouble();
		grade3 = sc.nextDouble();

		Student st = new Student();
		st.Student(name, grade1, grade2, grade3);
		
		st.calcGrade();

		sc.close();
	}
}

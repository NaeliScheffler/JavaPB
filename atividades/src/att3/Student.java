package att3;

public class Student {
	String name;
	double grade1;
	double grade2;
	double grade3;
	boolean pass;
	double grade;

	public void Student(String name, double grade1, double grade2, double grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public void calcGrade() {
		grade = grade1 + grade2 + grade3;
		if (grade >= 60) {
			System.out.println("Final Grade = " + grade + " PASS");
		} else {
			System.out.println("Final Grade = " + grade + " FAILED\n MISSING " + (60 - grade) + " POINTS");

		}
	}

}

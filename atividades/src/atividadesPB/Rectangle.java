package atividadesPB;

public class Rectangle {

	double largura;
	double comprimento;
	double area;
	double perimetro;
	double diagonal;

	public void setAtributos(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public void areaR() {
		area = largura * comprimento;
		System.out.println(area);
	}

	public void perimetroR() {
		perimetro = 2 * (largura * comprimento);
		System.out.println(perimetro);
	}

	public void diagonalR() {
		diagonal = Math.sqrt(Math.pow(comprimento, 2) + Math.pow(largura, 2));
		System.out.println(diagonal);
	}

}

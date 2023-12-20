package att2;

public class Funcionario {
	String nome;
	double salarioBruto;
	double imposto;
	double aumento;

	public Funcionario(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + nome + "   Salário: " + (salarioBruto - imposto));
	}

	public void calculaAumento(double aum) {
		salarioBruto = salarioBruto + (salarioBruto * 0.1);
	}

}

package desafioPensionato;

public class Pensionato {
	private Quartos[] quartos = new Quartos[10];
	private Estudantes[] locatarios;

	public Pensionato() {
		this.locatarios = new Estudantes[10];
	}

	public Quartos[] getQuartos() {
		return quartos;
	}

	public Estudantes[] getLocatarios() {
		return locatarios;
	}

	public void setLocatarios(Estudantes[] locatarios) {
		this.locatarios = locatarios;
	}

	public void registrarAluguel(Estudantes est) {
		System.out.println("Nome do estudante: " + est.nome + " Email: " + est.email + " Quarto escolhido: "
				+ est.quartoEscolhido);
		locatarios[est.quartoEscolhido] = est;
	}

	public void imprimirRelatorio() {
		System.out.println("\nRelatório de Aluguéis:");
		for (Estudantes estudante : locatarios) {
			if (estudante != null) {
				System.out.println("Nome: " + estudante.nome + " Email: " + estudante.email + " Quarto Escolhido: "
						+ estudante.quartoEscolhido);
			}
		}
	}
}

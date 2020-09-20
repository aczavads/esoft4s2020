package WesleyBoer.aula20200901;

import javax.management.RuntimeErrorException;

public class Carro {
	private boolean ligado = false;
	private double combustivelNoTanqueEmLitros = 0.00;
	private DecimalPositivo capacidadeDoTanqueEmLitros;

	public Carro(double capacidadeDoTanqueEmLitros) {
		this.capacidadeDoTanqueEmLitros = new DecimalPositivo(capacidadeDoTanqueEmLitros,
				"A capacidade do tanque deve ser maior que 0.00!");
	}

	public void abastecer(double volumeAbastecidoEmLitros) {
		this.volumeAbastecidoEmLitros = new DecimalPositivo(volumeAbastecidoEmLitros,
				"O volume abastecido deve ser maior que 0.00!");

		combustivelNoTanqueEmLitros += volumeAbastecidoEmLitros;

		// System.out.println("Abastecendo " + volumeEmLitros + " litros.");
	}

	public void ligar() {
		combustivelNoTanqueEmLitros -= 0.05;
		ligado = true;
		// System.out.println("Ligando o carro...");
	}

	public boolean isLigado() {
		return ligado;
	}

	public double getCombustivelNoTanqueEmLitros() {
		return combustivelNoTanqueEmLitros;
	}

	public double getCapacidadeDoTanqueEmLitros() {
		return capacidadeDoTanqueEmLitros;
	}

}

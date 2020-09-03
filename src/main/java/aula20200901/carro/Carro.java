package aula20200901.carro;

public class Carro {
    private boolean ligado = false; 
    private double combustívelNoTanqueEmLitros = 0.00;
	private DecimalPositivo capacidadeDoTanqueEmLitros;


	public Carro(double capacidadeDoTanqueEmLitros) {
		this.capacidadeDoTanqueEmLitros = new DecimalPositivo(
			capacidadeDoTanqueEmLitros, 
			"A capacidade do tanque deve ser maior que 0.00!");
	}
	public void abastecer(double volumeAbastecidoEmLitros) {
		Validações.exceçãoSeMenorOuIgualZero(volumeAbastecidoEmLitros, "O volume abastecido deve ser maior que 0.00!");
		if (capacidadeDoTanqueEmLitros.getValor() < volumeAbastecidoEmLitros + combustívelNoTanqueEmLitros) {
		//if (volumeAbastecidoEmLitros + combustívelNoTanqueEmLitros > capacidadeDoTanqueEmLitros.getValor()) {
			throw new RuntimeException(
				"O tanque só comporta " 
				+ capacidadeDoTanqueEmLitros 
				+ " litros. Abastecimento excessivo: " 
				+ (volumeAbastecidoEmLitros + combustívelNoTanqueEmLitros) 
				+ " litros.");

		}
        combustívelNoTanqueEmLitros += volumeAbastecidoEmLitros;
	}
	public void ligar() {
        combustívelNoTanqueEmLitros -= 0.05;
        ligado = true; 
	}
	public boolean isLigado() {
		return ligado;
	}
	public double getCombustívelNoTanqueEmLitros() {
		return combustívelNoTanqueEmLitros;
	}
	public double getCapacidadeDoTanqueEmLitros() {
		return capacidadeDoTanqueEmLitros.getValor();
	}

}

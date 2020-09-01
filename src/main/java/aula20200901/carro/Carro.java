package aula20200901.carro;

public class Carro {
    private boolean ligado = false; 
    private double combustívelNoTanqueEmLitros = 0.00;
	private double capacidadeDoTanqueEmLitros = 0.00;

	public Carro(double capacidadeDoTanqueEmLitros) {
		this.capacidadeDoTanqueEmLitros = capacidadeDoTanqueEmLitros;
	}
	public void abastecer(double volumeAbastecidoEmLitros) {
		if (volumeAbastecidoEmLitros + combustívelNoTanqueEmLitros > capacidadeDoTanqueEmLitros) {
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
		return capacidadeDoTanqueEmLitros;
	}

}

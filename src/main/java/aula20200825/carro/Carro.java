package aula20200825.carro;

public class Carro {
    private boolean ligado = false; 
    private double volumeDeCombustívelNoTanqueEmLitros = 0.00;

	public void abastecer(double volumeAbastecidoEmLitros) {
        volumeDeCombustívelNoTanqueEmLitros += volumeAbastecidoEmLitros;
	}
	public void ligar() {
        volumeDeCombustívelNoTanqueEmLitros -= 0.05;
        ligado = true; 
	}
	public boolean isLigado() {
		return ligado;
	}
	public double getVolumeDeCombustívelNoTanqueEmLitros() {
		return volumeDeCombustívelNoTanqueEmLitros;
	}

}

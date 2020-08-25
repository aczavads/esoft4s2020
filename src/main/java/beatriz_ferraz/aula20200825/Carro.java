package beatriz_ferraz.aula20200825;

public class Carro {
    private boolean ligado = false;
    private double volumeDeCombustivelNoTanqueEmLitros = 0.00;
    public void abastecer(double volumeAbastecidoEmLitros) {
        volumeDeCombustivelNoTanqueEmLitros += volumeAbastecidoEmLitros;
    }
	public void ligar() {
        volumeDeCombustivelNoTanqueEmLitros -= 0.05;
        ligado = true;
    }
    
	public boolean isLigado() {
		return ligado;
	}
	public double getVolumeDeCombustivelNoTanqueEmLitros() {
		return volumeDeCombustivelNoTanqueEmLitros;
	}
}

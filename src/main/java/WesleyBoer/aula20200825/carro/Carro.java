package WesleyBoer.aula20200825.carro;

public class Carro {
    private boolean ligado = false;
    private double volumeDeCombustivelNoTanqueEmLitros = 0.00;

	public void abastecer(double volumeAbastecidoEmLitros) {
        volumeDeCombustivelNoTanqueEmLitros += volumeAbastecidoEmLitros;
        //System.out.println("Abastecendo " + volumeEmLitros + " litros.");
	}

	public void ligar() {
        volumeDeCombustivelNoTanqueEmLitros -= 0.05;
        ligado = true;
       // System.out.println("Ligando o carro...");
	}

	public boolean isLigado() {
		return ligado;
	}

	public double getVolumeDeCombustivelNoTanqueEmLitros() {
		return volumeDeCombustivelNoTanqueEmLitros;
	}

}

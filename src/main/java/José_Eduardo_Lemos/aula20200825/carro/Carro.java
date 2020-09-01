package José_Eduardo_Lemos.aula20200825.carro;

public class Carro {
    private  boolean ligado = false;
    private double volumeDeCombustívelNoTanqueEmLitros = 0.00;
    public double volumeAbastecidoEmLitros = 0.00;

    public void abastecer (double volumeAbastecidoEmLitros){
        volumeDeCombustívelNoTanqueEmLitros += volumeAbastecidoEmLitros;
        System.out.println("Abastecendo " + volumeAbastecidoEmLitros + " litros.");
    }

	public void ligar() {
        this.volumeDeCombustívelNoTanqueEmLitros -=0.05;
        ligado = true;
	}

	public boolean isligado() {
		return ligado;
	}

	public double getVolumeDeCombustívelNoTanqueEmLitros() {
		return volumeDeCombustívelNoTanqueEmLitros;
    }
}

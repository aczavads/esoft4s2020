package magno_toniolo.aula20200825.carro;

public class Carro {
    private boolean ligado;
    private double VolumeDeCombustivelNoTanqueEmLitros = 0.00; 

    public void ligar() {
        VolumeDeCombustivelNoTanqueEmLitros -= 0.05;
        ligado = true;
    }

    public boolean isLigado() {
        return ligado;
    } 

    public void abastecer(double volumeAbastecidoEmLitros) {
        VolumeDeCombustivelNoTanqueEmLitros += volumeAbastecidoEmLitros;
    }

    public double getVolumeDeCombustívelNoTanqueEmLitros() {
        return VolumeDeCombustivelNoTanqueEmLitros;
    }
}

package magno_toniolo.aula20200901.carro;

public class Carro {
    private boolean ligado;
    private double combustívelNoTanqueEmLitros = 0.00;
    private double capacidadeDoTanqueEmLitros = 0.00;

    public Carro(double capacidadeDoTanqueEmLitros) {
        this.capacidadeDoTanqueEmLitros = capacidadeDoTanqueEmLitros;
        if (capacidadeDoTanqueEmLitros <= 0) {
            throw new RuntimeException(" A capacidade do tanque de combustível deve ser maior do que zero. ");
        }
    }

    public void abastecer(double volumeAbastecidoEmLitros) {
        if (volumeAbastecidoEmLitros + combustívelNoTanqueEmLitros > capacidadeDoTanqueEmLitros) {
            throw new RuntimeException(
                    "O tanque só comporta " + capacidadeDoTanqueEmLitros + " litros. Abastecimento excessivo de "
                            + (volumeAbastecidoEmLitros + combustívelNoTanqueEmLitros) + " litros. ");
        }
        if (volumeAbastecidoEmLitros <= 0) {
            throw new RuntimeException(" Não é possível abastecer valores negativos. ");
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

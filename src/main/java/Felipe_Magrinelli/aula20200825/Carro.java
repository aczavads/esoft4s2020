package Felipe_Magrinelli.aula20200825;

public class Carro {
    private boolean ligado = false;
    private double volumeEmLitros = 0.00;

    public void abastecer(double volumeAbastecido)
    {
        volumeEmLitros += volumeAbastecido;
    }

    public void ligar(){
        volumeEmLitros -= 0.05;
        ligado = true;
    }

    public boolean isLigado(){
        return ligado;
    }

    public double getVolumeCombustivel()
    {
        return volumeEmLitros;
    }
}

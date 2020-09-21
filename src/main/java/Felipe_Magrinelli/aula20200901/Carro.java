package Felipe_Magrinelli.aula20200901;

public class Carro {
    private boolean ligado = false;
    private double combustivelNoTanqueEmLitros = 0.00;
    private double capacidadeDoTanqueEmLitros = 0.00;

    private void exceçãoSeMenorOuIgualZero(double valor, String mensagemErro)
    {
        if(valor <= 0.00)
        {
            throw new RuntimeException(mensagemErro);
        }
    }

    public Carro(double capacidadeDoTanqueEmLitros)
    {
        exceçãoSeMenorOuIgualZero(capacidadeDoTanqueEmLitros, "A capacidade do tanque em litros deve ser maior que 0 litros.");
        this.capacidadeDoTanqueEmLitros = capacidadeDoTanqueEmLitros;
    }

    public void abastecer(double volumeAbastecidoEmLitros)
    {
        if(volumeAbastecidoEmLitros + combustivelNoTanqueEmLitros > capacidadeDoTanqueEmLitros){
            throw new RuntimeException("O tanque só comporta " + capacidadeDoTanqueEmLitros + " litros. Abastecimento excessivo: " + (volumeAbastecidoEmLitros + combustivelNoTanqueEmLitros) + " litros.");
        }else if(volumeAbastecidoEmLitros <= 0)
        {
            throw new RuntimeException("O volume abastecido deve ser maior que 0 litros.");
        }
        exceçãoSeMenorOuIgualZero(volumeAbastecidoEmLitros, "O volume abastecido deve ser maior que 0 litros.");
        combustivelNoTanqueEmLitros += volumeAbastecidoEmLitros;
    }

    public void ligar(){
        combustivelNoTanqueEmLitros -= 0.05;
        ligado = true;
    }

    public boolean isLigado(){
        return ligado;
    }

    public double getVolumeCombustivel()
    {
        return combustivelNoTanqueEmLitros;
    }
}

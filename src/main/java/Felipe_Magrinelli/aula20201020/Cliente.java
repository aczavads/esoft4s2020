package Felipe_Magrinelli.aula20201020;

public class Cliente extends Papel {
    private double desconto;
    private double limiteDeCredito;

    public Cliente(double desconto, double limiteDeCredito) {
        super();
        this.desconto = desconto;
        this.limiteDeCredito = limiteDeCredito;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }
}

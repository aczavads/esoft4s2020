package aula20201020.modeloOOMercado;

public class Cliente extends Papel {

	private double desconto;
    private double limiteDeCrédito;

    public Cliente(double desconto, double limiteDeCrédito) {
        this.desconto = desconto;
        this.limiteDeCrédito = limiteDeCrédito;
    }
    
    public double getDesconto() {
        return desconto;
    }

    public double getLimiteDeCrédito() {
        return limiteDeCrédito;
    }

}

package tiago_lopes_barcelos.aula20201020.modeloOOMercado;

public class Cliente extends Papel {

	private double desconto;
    private double limiteDeCrédito;

    public Cliente(double desconto, double limiteDeCrédito) {
        super();
        this.desconto = desconto;
        this.limiteDeCrédito = limiteDeCrédito;
    }
    
    public double getDescontoCliente() {
        return desconto;
    }

    public double getLimiteDeCrédito() {
        return limiteDeCrédito;
    }

}

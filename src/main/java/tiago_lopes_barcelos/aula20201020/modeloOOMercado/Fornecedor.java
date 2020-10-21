package tiago_lopes_barcelos.aula20201020.modeloOOMercado;

public class Fornecedor extends Papel {
    private double desconto;

    public Fornecedor(double desconto) {
        super();
        this.desconto = desconto;
    }
    
    public double getDescontoFornecedor() {
        return desconto;
    }

}

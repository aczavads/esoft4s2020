package beatriz_ferraz.aula20201020.ModeloOOMercado;

public class Fornecedor extends Papel{
    private double desconto;
    
    public Fornecedor(double desconto) {
        super();
        this.desconto = desconto;
    }
    
    public double getDesconto() {
        return desconto;
    }
}

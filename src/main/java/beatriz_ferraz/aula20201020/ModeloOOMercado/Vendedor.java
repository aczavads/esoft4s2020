package beatriz_ferraz.aula20201020.ModeloOOMercado;

public class Vendedor extends Papel{
    private int numeroDeFuncionario;

    public Vendedor (int numeroDeFuncionario) {
        super();
        this.numeroDeFuncionario = numeroDeFuncionario;
    }

    public int getNumeroDeFuncionario() {
        return numeroDeFuncionario;
    }
}

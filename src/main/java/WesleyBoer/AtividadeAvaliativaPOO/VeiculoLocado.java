package WesleyBoer.AtividadeAvaliativaPOO;

public class VeiculoLocado {
    private double valorDeFabrica;

    public VeiculoLocado() {

    }

    public VeiculoLocado(double valorDeFabrica) {
        if (valorDeFabrica < 0) // Validação solicitada
        {
            throw new RuntimeException("O valor deve ser positivo!");
        }
        this.valorDeFabrica = valorDeFabrica;
    }

    public double getValorDeFabrica() {
        return valorDeFabrica;
    }

    public void setValorDeFabrica(double valorDeFabrica) {
        this.valorDeFabrica = valorDeFabrica;
    }
    
}

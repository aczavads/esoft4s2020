package WesleyBoer.AtividadeAvaliativaPOO;

public class Moto extends VeiculoLocado{
    private String categoriaDaMoto;
    private double valorDeAluguel;

    public Moto() {
        super();
    }

    public Moto (String categoriaDaMoto, double valorDeFabrica) {
        this.categoriaDaMoto = categoriaDaMoto;
        this.setValorDeFabrica(valorDeFabrica);
    }

    public String getCategoriaDaMoto() {
        return categoriaDaMoto;
    }

    public void setCategoriaDaMoto(String categoriaDaMoto) {
        this.categoriaDaMoto = categoriaDaMoto;
    }

    public double getValorDeAluguel() {
        return valorDeAluguel;
    }

    public void setValorDeAluguel(double valorDeAluguel) {
        this.valorDeAluguel = valorDeAluguel;
    }
}

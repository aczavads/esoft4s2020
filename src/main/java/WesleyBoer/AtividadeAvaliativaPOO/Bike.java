package WesleyBoer.AtividadeAvaliativaPOO;

public class Bike extends VeiculoLocado{

    private String tipoDaBike;
    private double valorDeAluguel;


// Construtor padrão
public Bike() {
    super();
}

// Construtor alternativo
public Bike (String tipoDaBike, double valorDeFabrica) {
    this.tipoDaBike = tipoDaBike;
    this.setValorDeFabrica(valorDeFabrica);
}

public String getTipoDaBike() {
    return tipoDaBike;
}

public void setTipoDaBike(String tipoDaBike) {
    this.tipoDaBike = tipoDaBike;
}

public String getValorDeAluguel() {
    return valorDeAluguel;
}

public void setValorDeAluguel(String valorDeAluguel) {
    this.valorDeAluguel = valorDeAluguel;
}

@Override
public void setValorDeFabrica(double valorDeFabrica) {
    // TODO Auto-generated method stub
    super.setValorDeFabrica(valorDeFabrica*0.1);
}

}
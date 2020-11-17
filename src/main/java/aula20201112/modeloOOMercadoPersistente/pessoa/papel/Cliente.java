package aula20201112.modeloOOMercadoPersistente.pessoa.papel;

import javax.persistence.Entity;

@Entity
public class Cliente extends Papel {

	private double desconto;
    private double limiteDeCrédito;

    public Cliente() {
        super();
    }

    public Cliente(double desconto, double limiteDeCrédito) {
        this();
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

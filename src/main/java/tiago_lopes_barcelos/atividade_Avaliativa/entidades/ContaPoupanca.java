package tiago_lopes_barcelos.atividade_Avaliativa.entidades;

public class ContaPoupanca extends ContaUnitaria {
	
	private Double taxaDeJuro;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numeroDaConta, String titular, Double saldo, Double taxaDeJuro) {
		super(numeroDaConta, titular, saldo);
		this.taxaDeJuro = taxaDeJuro;
	}

	public Double getTaxaDeJuro() {
		return taxaDeJuro;
	}

	public void setTaxaDeJuro(Double taxaDeJuro) {
		this.taxaDeJuro = taxaDeJuro;
	}
	
	 public void atualizaSaldo() {
		 saldo += saldo * taxaDeJuro; 
	 }

}

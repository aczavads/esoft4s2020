package tiago_lopes_barcelos.atividade_Avaliativa.entidades;

public class ContaUnitaria {

	private Integer numeroDaConta;
	private String titular;
	protected Double saldo;

	public ContaUnitaria() {

	}

	public ContaUnitaria(Integer numeroDaConta, String titular, Double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque (double valor) {
		saldo -= valor;
		
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}

}

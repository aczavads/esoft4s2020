package tiago_lopes_barcelos.atividade_Avaliativa.entidades;

public class ContaEmpresa extends ContaUnitaria {

	private Double limiteDeEmprestimo;

	public ContaEmpresa() {
		super();

	}

	public ContaEmpresa(Integer numeroDaConta, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numeroDaConta, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteDeEmprestimo) {
			deposito(valor);
		}
	}
}

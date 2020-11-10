package aula20200730.introduçãoEncapsulamento;

public class Pessoa {
	//- nome : String
	private String nome;
	//+ idadeEmAnos : int
	public int idadeEmAnos;

	public void mudarNome(String novoNome) {
		validarNome(novoNome);
		nome = novoNome;
	}
	
	public String recuperarNome() {
		return nome;
	}
	
	private void validarNome(String nome) {
		if (nome == null) {
			throw new RuntimeException("Nome não pode ser nulo!");
		}
		if (nome.length() == 0) {
			throw new RuntimeException("Nome não pode ser vazio!");
		}
		if (nome.split(" ").length == 1) {			
			throw new RuntimeException("O nome deve ser composto por mais de uma palavra! Nome informado: " + nome);
		}
	}

	
}

package aula20200728.introdução;

public class Elefante {
	//Atributos do Elefante: entendam como os campos que vocês definiam nos structs com o Marcello em C.
	private String nome;
	
	//construtor: elemento que é invocado(chamado) no momento da construção do objeto, ou seja, quando usamos o "new"
	public Elefante(String paramNome) {
		this.nome = paramNome;
	}
	
	public void andar() {
		System.out.println("Elefante [" + nome + "] andando... tum tum tum! :D");
	}
}

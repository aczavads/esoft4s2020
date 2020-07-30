package aula20200730.introdução;

public class AppIntrodução {
	
	
	//+ main(args : String[]) : void
	//------------------------------   -> sublinhado por ser static.
	public static void main(String[] args) {
		//Pessoa josias = null;
		Pessoa josias = new Pessoa();
		Pessoa maria = new Pessoa();
		
		
		
		
		//josias.nome = null;       //Erro! Não pode ser nulo!
		//josias.nome = "";         //Erro! Não pode ser vazio!
		//josias.nome = "Josias";   //Erro! Não pode ter uma palavra só!
		josias.nome = "Josias Júnior";
		validarNome(josias.nome);
		
		maria.nome = "Maria";
//		validarNome(maria.nome);
		
		
		System.out.println("O nome da pessoa 1 é: " + josias.nome);
		System.out.println("O nome da pessoa 2 é: " + maria.nome);
		System.out.println("Fim.");
	}
	
	public static void validarNome(String nome) {
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

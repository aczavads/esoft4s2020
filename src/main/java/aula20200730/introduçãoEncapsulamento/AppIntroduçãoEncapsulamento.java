package aula20200730.introduçãoEncapsulamento;

public class AppIntroduçãoEncapsulamento {
	
	
	//+ main(args : String[]) : void
	//------------------------------   -> sublinhado por ser static.
	public static void main(String[] args) {
		//Pessoa josias = null;
		Pessoa josias = new Pessoa();
		Pessoa maria = new Pessoa();
		
		//josias.nome = null;       //Erro! Não pode ser nulo!
		//josias.nome = "";         //Erro! Não pode ser vazio!
		//josias.nome = "Josias";   //Erro! Não pode ter uma palavra só!
		
		//josias.nome = "Josias Júnior";
		josias.mudarNome("Josias");
		
		//maria.nome = "Maria";
		maria.mudarNome("Maria");
		
		
		System.out.println("O nome da pessoa 1 é: " + josias.recuperarNome());
		System.out.println("O nome da pessoa 2 é: " + maria.recuperarNome());
		System.out.println("Fim.");
	}
}

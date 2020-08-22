package aula20200728.introdução;


public class AppIntrodução {
	
	public static void main(String[] argumentos) {
		Elefante dumbo = new Elefante("Dumbo do Cirque du Soleil");
		dumbo.andar();
		
		Elefante jumbo = new Elefante("Jumbo do Beto Carreiro");
		jumbo.andar();
		jumbo.andar();
		jumbo.andar();
		/*
		String nome = "Ana Lúcia Beltrame Forte";
		
		//System.out.println(toUpperCase(nome));
		System.out.println(nome);
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.length());
		
		String[] componentesDoNome = nome.split(" ");
		for (int i = 0; i < componentesDoNome.length; i++) {
			System.out.println(componentesDoNome[i]);
		}
		*/
	}	
	
}

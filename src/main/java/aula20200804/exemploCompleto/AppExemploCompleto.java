package aula20200804.exemploCompleto;

public class AppExemploCompleto {
	
	public static void main(String[] args) {
		Cofre daSala = new Cofre();
		Cofre doEscritório = new Cofre();
		Gaveta doArmário = new Gaveta();
		
		doEscritório.fechar(123456);
		doArmário.fechar(999); //vai gerar uma exceção devido ao Override do método fechar em Gaveta, recusando senha 999.
		
		imprimirSeEstãoAbertos(daSala, doEscritório, doArmário);
		
		//doEscritório.abrir(123456);
		doEscritório.abrir(999);
		imprimirSeEstãoAbertos(daSala, doEscritório, doArmário);

				
	}
	private static void imprimirSeEstãoAbertos(RecipienteSeguro... recipientes) {
		System.out.println(">>>>>>>>>>");
		for (int posição = 0; posição < recipientes.length; posição++) {
			System.out.println("  Está aberto? " + recipientes[posição].estáAberto() + " objeto=" + recipientes[posição].toString());
		}		
		System.out.println("<<<<<<<<<<");
	}

}

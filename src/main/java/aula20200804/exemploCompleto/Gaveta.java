package aula20200804.exemploCompleto;

public class Gaveta extends RecipienteSeguro {
	
	
	//@Override
	public void fechar(int senha) {
		if (senha == 999) {
			throw new RuntimeException("Gaveta não aceita esta senha!");
		}
		super.fechar(senha);
	}

}

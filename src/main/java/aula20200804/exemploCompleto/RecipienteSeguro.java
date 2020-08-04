package aula20200804.exemploCompleto;

public class RecipienteSeguro {
	public static final int SEM_SENHA = -1;
	//- aberto : boolean = true
	private boolean aberto = true;
	
	//- senhaAtual : int
	private int senhaAtual = SEM_SENHA;
	
	//+ abrir(senha : int) : void
	public void abrir(int senhaInformada) {
		if (estáFechado() && this.senhaAtual == senhaInformada) {
			senhaAtual = SEM_SENHA;
			aberto = true;
		}
	}
	
	//+ fechar(senha : int) : void
	public void fechar(int senha) {
		if (estáAberto()) {
			senhaAtual = senha;
			aberto = false;
		}		
	}
	
	//+ estáAberto() : boolean
	public boolean estáAberto() {
		return aberto;
	}
	
	//+ estáFechado() : boolean
	public boolean estáFechado() {
		return !aberto;
	}

}

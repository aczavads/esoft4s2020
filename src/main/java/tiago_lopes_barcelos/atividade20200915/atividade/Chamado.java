package tiago_lopes_barcelos.atividade20200915.atividade;

public class Chamado {

    private String natureza;  
        
	public Chamado(String natureza) {
        this.natureza = natureza;
	}

	public Chamado() {

    }   
    
    public String getNatureza() {
        return natureza;
    }

    public String toString() {
        return "Chamado [Natureza = " + natureza +"]";
    }

}

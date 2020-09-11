package WesleyBoer.aula20200820;

public class Carro {
    private double combustivelNoTRanque = 40.0;
    private boolean ligado = false;


    public void ligar(){ // método modificador
        //System.out.println("Ligando...");
        ligado = true;
    }

    public void desligar(){ // método modificador
        //System.out.println("Desligando...");
        ligado = false;
    }

    public boolean estaLigado(){ // método de obtenção, que retorna um valor sem alterar os demais elementos da instância
        return ligado;
    }

}

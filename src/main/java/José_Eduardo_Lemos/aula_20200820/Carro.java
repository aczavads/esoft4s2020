package José_Eduardo_Lemos.aula_20200820;

public class Carro {
    private boolean ligado = false;
    private double combustívelNoTanque = 40.0;  

    public void ligar() {
        ligado = true;
        //System.out.println("Ligando...");
    }

    public void desligar() {
        ligado = false;
       //System.out.println("Desligando...");
        
    }
    public boolean estáLigado(){
        return ligado;
    }
}

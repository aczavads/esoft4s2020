package beatriz_ferraz.aula20200820;

public class Carro {
    private boolean ligado = false;

    public void ligar() {
        //System.out.println("Ligando!");
        ligado = true;
    }

    public void desligar() {
        //System.out.println("Desligando!");
        ligado = false;
    }

    public boolean estaLigado(){
        return ligado;
    }
}

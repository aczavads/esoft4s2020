package tiago_lopes_barcelos.provaQ4;

public class Questão4 {
    public static void main(String[] args) 
    {
        Caneta caneta = new Caneta();  
        caneta.modelo = "BIC cristal";
        caneta.cor = "Azul";
        caneta.tampar();
        caneta.status();  
        caneta.escrever();
    }        
}

package tiago_lopes_barcelos.provaQ4;

public class Caneta {
    public String modelo;
    public String cor;
    private boolean tampada;
    
    public void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void escrever()
    {
        if (this.tampada == true)
        {
            System.out.println("Tampada! Não posso escrever.");
        }
        else
        {
            System.out.println("Posso escrever.");
        }
    }
    
    public void tampar()
    {
        this.tampada = true;
    }    
}

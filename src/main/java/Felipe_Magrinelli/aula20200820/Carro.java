package Felipe_Magrinelli.aula20200820;

public class Carro {
    private double combustivel = 40.0;
    private boolean ligado = false;

    public void ligar(String nome){
        //System.out.println(nome +" ligando");
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public boolean estaLigado(){
        return ligado;
    }

    public double qntdeCombustivel(){
        return combustivel;
    }
}

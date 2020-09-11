package WesleyBoer.aula20200820;

public class App {

    public static void main(String[] args) {
        for (int cont = 0; cont < 10; cont++){
            if (cont == 5){
                System.out.println("Opa, olha o cinco aí!");
            }
            else{
                System.out.println("Hello world!");
            }
        }
        Carro fusca = new Carro();
        Carro fiat147 = new Carro();
        fusca.ligar();
        fusca.desligar();
        fiat147.ligar();
        System.out.println("O Fiat 147 está ligado? " + fiat147.estaLigado());
        System.out.println("O Fusca está ligado? " + fusca.estaLigado());
    }
    
}
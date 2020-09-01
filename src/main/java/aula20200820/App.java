package aula20200820;

public class App {

    public static void main(String[] args) {
        Carro fusca = new Carro(); 
        Carro fiat147 = new Carro();
        fusca.ligar();
        fusca.desligar();
        fiat147.ligar();
        System.out.println(
            "O Fusca está ligado? " + fusca.estáLigado());
        System.out.println(
            "O Fiat 147 está ligado? " + fiat147.estáLigado());
    }            
}


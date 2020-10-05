package tiago_lopes_barcelos.aula20200820;

public class App {

    // main + enter
    public static void main(String[] args) {
        /*
         * for (int i = 0; i < 10; i++) { if (i == 5){
         * System.out.println("Opa, olha a vez do cinco aí"); }
         * System.out.println("Hello world!!!"); }
         */

        Carro fusca = new Carro();
        Carro fiat147 = new Carro();
        fusca.ligar();
        fusca.desligar();
        fiat147.ligar();
        System.out.println("O Fusca está ligado? " + fusca.estáLigado());
        System.out.println("O Fiat 147 está ligado? " + fiat147.estáLigado());
    }
}
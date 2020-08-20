package José_Eduardo_Lemos.aula_20200820;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) {
    
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            if (i == 5){
                System.out.println("Opa, Olha o cinco aí!");
            }
        }
        Carro fusca = new Carro();
        Carro fiat147= new Carro();
        fusca.ligar();    
        fusca.desligar();
        fiat147.ligar();

        System.out.println("O Fiat 147 está ligado? " + fiat147.estáLigado());
        System.out.println("O Fusca está ligado? " + fusca.estáLigado());

        
    }
}
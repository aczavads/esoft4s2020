package beatriz_ferraz.aula20200820;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                System.out.println("Opa, olha o cinco ai!");
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

        System.out.println(
             "O Fiat 147 esta ligado? " + fiat147.estaLigado());
             System.out.println(
                "O Fusca esta ligado? " + fusca.estaLigado());     
    }
}
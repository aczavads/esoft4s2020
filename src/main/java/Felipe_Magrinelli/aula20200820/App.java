package Felipe_Magrinelli.aula20200820;

public class App {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i==5)
            {
                System.out.println("Deu cinco!");
            }else{
                System.out.println("Hello world!");
            }
        }
        Carro fusca = new Carro();
        fusca.ligar("Fusca");
        System.out.println("O fusca esta ligado ? " + fusca.estaLigado());

        System.out.println("Quanto de combustivel o fusca tem ? "+ fusca.qntdeCombustivel());
    }
}

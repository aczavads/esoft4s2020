package aula20200901.carro;

public class AppCarro {

    public static void main(String[] args) {
        Carro novo = new Carro(52.00);
        novo.abastecer(30.5);
        novo.abastecer(10.5);
        novo.ligar();
        boolean carroLigado = novo.isLigado();
        double combustívelNoTanqueEmLitros = novo.getCombustívelNoTanqueEmLitros();

        System.out.println(
                "O carro está ligado? " + carroLigado + ", combustivel no tanque= " + combustívelNoTanqueEmLitros);
    }

}
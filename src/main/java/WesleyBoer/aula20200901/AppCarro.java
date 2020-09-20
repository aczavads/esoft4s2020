package WesleyBoer.aula20200901;

public class AppCarro {

    public static void main(String[] args) {
        Carro novo = new Carro(-52.00);
        novo.abastecer(-30.5);
        novo.abastecer(-30.5);
        novo.ligar();
        boolean carroLigado = novo.isLigado();
        double combustivelNoTanqueEmLitros = novo.getCombustivelNoTanqueEmLitros();
        System.out.println(
                "O carro está ligado? " + carroLigado + ", combustível no tanque = " + combustivelNoTanqueEmLitros);
    }

}
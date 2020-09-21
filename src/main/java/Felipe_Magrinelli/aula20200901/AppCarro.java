package Felipe_Magrinelli.aula20200901;


import Felipe_Magrinelli.aula20200901.Carro;

public class AppCarro {
    public static void main(String[] args) {
        Carro novo = new Carro(100);

        novo.abastecer(10);
        novo.abastecer(-10);
        novo.ligar();

        boolean carroLigado = novo.isLigado();
        double combustivelNoTanqueEmLitros = novo.getVolumeCombustivel();

        System.out.println("O carro está ligado ?" + carroLigado +", combustível no tanque = " + combustivelNoTanqueEmLitros);

    }
}

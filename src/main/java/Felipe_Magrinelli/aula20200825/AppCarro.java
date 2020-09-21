package Felipe_Magrinelli.aula20200825;


public class AppCarro {
    public static void main(String[] args) {
        Carro novo = new Carro();

        novo.abastecer(30.5);
        novo.ligar();

        boolean carroLigado = novo.isLigado();
        double volumeEmLitros = novo.getVolumeCombustivel();

        System.out.println("O carro está ligado ?" + carroLigado +", combustível no tanque = " + volumeEmLitros);

    }
}

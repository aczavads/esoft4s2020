package beatriz_ferraz.aula20200825;

public class AppCarro {
    public static void main(String[] args) {
        Carro novo = new Carro();
        novo.abastecer(30.5);
        novo.ligar();
        boolean carroLigado = novo.isLigado();
        double volumeEmLitros = novo.getVolumeDeCombustivelNoTanqueEmLitros();

        System.out.println("O carro está ligado? " + carroLigado + ", combustivel no tanque= " + volumeEmLitros);
    }
}
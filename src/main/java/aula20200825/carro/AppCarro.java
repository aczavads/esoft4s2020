package aula20200825.carro;

public class AppCarro {
    
    public static void main(String[] args) {
        Carro novo = new Carro();
        novo.abastecer(30.5);
        novo.ligar();
        boolean carroLigado = novo.isLigado();
        double volumeEmLitros = novo.getVolumeDeCombustívelNoTanqueEmLitros();

        System.out.println("O carro está ligado? " + carroLigado + ", combustivel no tanque= " + volumeEmLitros);
    }

}
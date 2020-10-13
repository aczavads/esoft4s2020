package magno_toniolo.teste.teste_2;

public class AppTeste2 {

    public static void main(String[] args) {

        Animal macaco = new Animal();
        macaco.setAnimal("Macaco louco", true);

        System.out.println("NOME DO BICHO: " + macaco.getNome());
        System.out.println("É BRAVO? " + macaco.getBravo());

        macaco.mudarHumor();

        System.out.println(macaco.getBravo());
    }

}

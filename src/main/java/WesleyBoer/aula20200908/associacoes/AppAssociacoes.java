package WesleyBoer.aula20200908.associacoes;

public class AppAssociacoes {
    public static void main(String[] args) {
        Pessoa josias = new Pessoa("Josias de Almeida");

        Endereço avBrasil777 = new Endereço("Av. Brasil", "777");
        Endereço avSãoDomingos123 = new Endereço("Av. São Domingos", "123");
        Endereço ruaBogotá555 = new Endereço("Rua Bogotá", "555");

        josias.addEndereço(avSãoDomingos123);
        josias.addEndereço(avBrasil777);

        josias.setEndereçoPrincipal(ruaBogotá555);

        System.out.println(josias);
        System.out.println(avBrasil777);
        System.out.println(avSãoDomingos123);

    }
}

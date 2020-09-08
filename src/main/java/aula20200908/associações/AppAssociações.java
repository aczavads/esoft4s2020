package aula20200908.associações;

public class AppAssociações {

    public static void main(String[] args) {
        Pessoa josias = new Pessoa("Josias de Almeida");

        Endereço avBrasil777 = new Endereço("Av. Brasil", "777");
        Endereço avSãoDomingos123 = new Endereço("Av. São Domingos", "123");
        Endereço ruaBogotá555 = new Endereço("Rua Bogotá", "555");

        josias.addEndereço(avSãoDomingos123);
        josias.addEndereço(avBrasil777);

        josias.setEndereçoPrincipal(avBrasil777);

        System.out.println(josias);
        System.out.println(avBrasil777);
        System.out.println(avSãoDomingos123);

        System.out.println("Opa!");
    }
    
}

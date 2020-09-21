package Felipe_Magrinelli.aula20200908;

import javax.xml.stream.events.EntityReference;

public class AppAssociações {
    public static void main(String[] args) {
        Pessoa Josias = new Pessoa("Josias de Almeida");

        Endereço avBrasil777 = new Endereço("Av. Brasil", "777");
        Endereço avSaoDomingos123 = new Endereço("Av. São Domingos", "123");
        Endereço ruaBogotá555 = new Endereço("Rua Bogotá", "555");

        Josias.addEndereço(avBrasil777);
        Josias.addEndereço(avSaoDomingos123);

        Josias.setEndereçoPrincipal(avSaoDomingos123);


    }
}

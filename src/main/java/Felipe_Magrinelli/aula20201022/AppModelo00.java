package Felipe_Magrinelli.aula20201022;

import java.util.ArrayList;
import java.util.List;

public class AppModelo00 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa uniCesumar = new Juridica("Universidade Cesuamar - CESUMAR", "01.544.654/0001-65");
        Pessoa wilson = new Fisica("Wilson Matos", "543.235.754-02");

        pessoas.add(uniCesumar);
        pessoas.add(wilson);

        wilson.assumirPapel(new Reitor("ATO_2020_012B"));
        wilson.assumirPapel(new Cliente(10.00, 1_000_000.00));
        //lançar exceção
        //wilson.assumirPapel(new Reitor("ATO_2020_012B"));

        for(Pessoa pessoa: pessoas){
            System.out.println("Nova pessoa: ");
            System.out.println(pessoa.getClass().getName());
            System.out.println("É reitor: " + pessoa.isReitor());
            if(pessoa.isReitor()){
                System.out.println("Número de ato da posse: " + pessoa.getReitor().getNumeroDoAtoDaPosse());
            }
        }
        ItemPedido item1 = new ItemPedido(2, 3.90);
        ItemPedido item2 = new ItemPedido(1, 13.90);
        Pedido pedido = new Pedido(item1);//o pedido precisa de um cliente e um itemPedido pelo menos, por isso foi passado com o parâmetro
        pedido.adicionarItemPedido(item2);
        System.out.println("O valor total do pedido é: " + pedido.getValorTotal());






        /*private static void testandoUUIDs(){
            Set<String> ids = new HashSet<>();
            for(int i = 0 ; i < 100_000; i++){
                ids.add(UUID.randomUUID().toString());
            }
            System.out.println("Numero de UUID: " + ids.size());
        }*/
    }
}

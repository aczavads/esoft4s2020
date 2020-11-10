package Felipe_Magrinelli.aula20201022;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends BaseEntity{
    private Integer número;
    private Pessoa cliente;
    List<ItemPedido> itensPedidos = new ArrayList<>();

    public Pedido(ItemPedido itempedido){
            if(!cliente.isCliente()){
                throw new PessoaNãoClienteException("Pessoas sem o papel de Cliente nao podem fazer pedidos!");
            }
        itensPedidos.add(itempedido);
    }

    public void adicionarItemPedido(ItemPedido itemPedido){
        itensPedidos.add(itemPedido);
    }

    public double getValorTotal() {
        double valorTotal = 0.00;
        for(ItemPedido item : itensPedidos){
            valorTotal = valorTotal + item.getValorTotal();
        }
        return valorTotal;
    }
}

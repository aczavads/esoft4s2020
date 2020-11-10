package Felipe_Magrinelli.aula20201020;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private double valorTotal;
    private Pessoa cliente;
    List<ItemPedido> itensPedidos = new ArrayList<>();

    public Pedido(ItemPedido itempedido){
        itensPedidos.add(itempedido);
    }

    public void adicionarItemPedido(ItemPedido itemPedido){
        itensPedidos.add(itemPedido);
    }
    public double getValorTotal() {
        for(ItemPedido item : itensPedidos){
            valorTotal = valorTotal + item.getValorTotal();
        }
        return valorTotal;
    }
}

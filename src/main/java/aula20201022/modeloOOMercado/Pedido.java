package aula20201022.modeloOOMercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends BaseEntity {
    private Integer número;
    private Pessoa cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Integer número, Pessoa cliente) {        
        super();
        if (!cliente.isCliente()) {
            throw new PessoaNãoClienteException("Pessoas sem o papel de Cliente não podem fazer pedidos!");
        }
        this.número = número;
        this.cliente = cliente;
    }

    public Integer getNúmero() {
        return número;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        double valorTotal = 0.00;
        for (ItemPedido itemPedido : itens) {
            valorTotal = valorTotal + itemPedido.getValorTotal();
        }
        return valorTotal;
    }

	public void adicionarItem(Produto produto, double quantidade, double valorUnitário) {
        this.itens.add(new ItemPedido(produto, quantidade, valorUnitário));
	}

}

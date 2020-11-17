package aula20201112.modeloOOMercadoPersistente.pedido;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import aula20201112.modeloOOMercadoPersistente.BaseEntity;
import aula20201112.modeloOOMercadoPersistente.pessoa.Pessoa;
import aula20201112.modeloOOMercadoPersistente.pessoa.PessoaNãoClienteException;
import aula20201112.modeloOOMercadoPersistente.produto.Produto;

@Entity
public class Pedido extends BaseEntity {
    private Integer número;
    
    @ManyToOne
    private Pessoa cliente;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "pedido_id")
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {
        super();
    }

    public Pedido(Integer número, Pessoa cliente) {        
        this();
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

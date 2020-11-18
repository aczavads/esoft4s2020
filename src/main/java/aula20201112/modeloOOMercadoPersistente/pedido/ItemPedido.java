package aula20201112.modeloOOMercadoPersistente.pedido;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import aula20201112.modeloOOMercadoPersistente.BaseEntity;
import aula20201112.modeloOOMercadoPersistente.produto.Produto;


@Entity
public class ItemPedido extends BaseEntity {
    private double quantidade;
    private double valorUnitário;

    @ManyToOne
    private Produto produto;

    public ItemPedido() {
        super();
    }

    public ItemPedido(Produto produto, double quantidade, double valorUnitário) {
        this();
        this.valorUnitário = valorUnitário;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public double getValorUnitário() {
        return valorUnitário;
    }
    public double getValorTotal() {
        return valorUnitário * quantidade;
    }
    

}

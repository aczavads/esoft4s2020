package Felipe_Magrinelli.aula20201022;

public class ItemPedido extends BaseEntity{
    private double quantidade;
    private double valorUnitario;
    private Produto produto;

    public double getValorTotal(){
        return quantidade*valorUnitario;
    }

    public ItemPedido(double quantidade, double valorUnitario){
        super();
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
}

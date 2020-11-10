package Felipe_Magrinelli.aula20201020;

public class ItemPedido {
    private double quantidade;
    private double valorUnitario;

    public double getValorTotal(){
        return quantidade*valorUnitario;
    }

    public ItemPedido(double quantidade, double valorUnitario){
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
}

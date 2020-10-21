package tiago_lopes_barcelos.aula20201020.modeloOOMercado;

public abstract class ItemPedido {

    private String produto;
    private double quantidade;
    private double valorUnitário;
    private int númeroPedido = 1;

    public ItemPedido (String produto){
        this.produto = produto;
    }

    public String getProduto (){
        return produto;
    }
    
    public ItemPedido(double quantidade, double valorUnitário) {
        númeroPedido++;
        this.quantidade = quantidade;
        this.valorUnitário = valorUnitário;
    }

    public int getNúmeroPedido (){
        return númeroPedido;
    }

    public double getQuantidade (){
        return quantidade;
    }    

    public double getValorUnitário(){
        return valorUnitário;
    }     

    public double valorTotal (){
        return quantidade * valorUnitário;
    }

}

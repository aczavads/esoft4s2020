package tiago_lopes_barcelos.aula20201020.modeloOOMercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Pedido {

    private int númeroPedido;
    private String produto;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int númeroPedido) {
        this.númeroPedido = númeroPedido;
    }

    public int getNúmeroPedido(){
        return númeroPedido;
    }

    public ArrayList<ItemPedido> getItens() {
        return (ArrayList<ItemPedido>) itens;
    }
    
    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }
    
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }     
     
    public void getTotalPedido(){   
        
        Iterator<ItemPedido> it = itens.iterator();
         double valor = 0;        
     
         while(it.hasNext()){
          ItemPedido aux = (ItemPedido) it.next();             
          valor += aux.getValorUnitário();              
         }         
       System.out.println(valor);            
    }
             
    public void addItem (ItemPedido item){
           
        itens.add(item);
    } 
}

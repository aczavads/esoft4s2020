package beatriz_ferraz.aula20200915;

public class Pagamento {
    private String estadoDoPagamento;

    public Pagamento(){

    }
    
    public Pagamento(String estadoDoPagamento){
        setEstadoDoPagamento(estadoDoPagamento);
    }

    public String getEstadoDoPagamento(){
        return estadoDoPagamento;
    }

    public void setEstadoDoPagamento(String estadoDoPagamento) {
        if(estadoDoPagamento != "pendente" && estadoDoPagamento != "pago"){
            throw new RuntimeException("Estado de pagamento inválido.");
        }
        this.estadoDoPagamento = estadoDoPagamento;
    }

 

    
}

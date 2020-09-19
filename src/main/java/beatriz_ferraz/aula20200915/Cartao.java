package beatriz_ferraz.aula20200915;

public class Cartao extends Pagamento {

    private long numeroDoCartao;
    
    public Cartao(){
        super();
    }

    public Cartao(String estadoDoPagamento, long numeroDoCartao) {
        super(estadoDoPagamento);
        this.numeroDoCartao = numeroDoCartao;
    }

    public long getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(long numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    @Override
    public void setEstadoDoPagamento(String estadoDoPagamento) {
        super.setEstadoDoPagamento(estadoDoPagamento);
    }
    
}

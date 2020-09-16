package beatriz_ferraz.aula20200915;


public class Boleto extends Pagamento {
	private String dataDoVencimento;
    private String dataDoPagamento;

    public Boleto(String estadoDoPagamento, String dataDoPagamento, String dataDoVencimento) {
        super(estadoDoPagamento);
        this.dataDoPagamento = dataDoPagamento;
        this.dataDoVencimento = dataDoVencimento;
    }

    public String getDataDoVencimento() {
        return dataDoVencimento;
    }

    public void setDataDoVencimento(String dataDoVencimento) {
        this.dataDoVencimento = dataDoVencimento;
    }

    public String getDataDoPagamento() {
        return dataDoPagamento;
    }

    public void setDataDoPagamento(String dataDoPagamento) {
        this.dataDoPagamento = dataDoPagamento;
    }
    
    @Override
    public void setEstadoDoPagamento(String estadoDoPagamento){
        super.setEstadoDoPagamento(estadoDoPagamento);
    }
}

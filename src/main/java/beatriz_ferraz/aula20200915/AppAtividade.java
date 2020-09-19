package beatriz_ferraz.aula20200915;

public class AppAtividade {
    public static void main(String[] args) {
       
        Cartao novoPagamento = new Cartao();
        
        Boleto novoBoleto = new Boleto("pago", "01/08/2020", "05/08/2020");

        System.out.println("Status do pagamento do boleto: " + novoBoleto.getEstadoDoPagamento() + 
                            "\nData do Pagamento: " + novoBoleto.getDataDoPagamento() +
                            "\nData do Vencimento: " + novoBoleto.getDataDoVencimento() + "\n\n");

        Cartao novaFatura = new Cartao("pendente", 80599045);
        
        System.out.println("Status do pagamento do cartao: " + novaFatura.getEstadoDoPagamento());
    }
}

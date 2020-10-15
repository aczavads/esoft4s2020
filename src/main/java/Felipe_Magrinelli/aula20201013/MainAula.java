package Felipe_Magrinelli.aula20201013;

public class MainAula {
    public static void main(String[] args) {

        Pessoa p1 = new Física("José de Almeida", "123");
        p1.setFornecedor(new Jurídica.Fornecedor(20.00));
        p1.setCliente(new Física.Cliente(5.00, 10_000.00));

        p1.bloquearFornecedor();
        p1.desbloquearFornecedor();

    }
}

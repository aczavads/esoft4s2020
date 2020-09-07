package beatriz_ferraz.aula20200903;

public class AppValueObjects {
    public static void main(String[] args) {

        Pessoa novaPessoa = new Pessoa();
        novaPessoa.getNome();
        Fisica novaPessoaFisica = new Fisica();
        novaPessoaFisica.getCpf();
        Juridica novaPessoaJuridica = new Juridica();
        novaPessoaJuridica.getNomeFantasia();
        novaPessoaJuridica.getCnpj();
    }
}
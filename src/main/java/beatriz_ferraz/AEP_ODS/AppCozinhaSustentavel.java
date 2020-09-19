package beatriz_ferraz.AEP_ODS;

public class AppCozinhaSustentavel {
    public static void main(String[] args) {
        
        System.out.println("Testando...");
        Receita novaReceita = new Receita("Chips de casca de abóbora ","[lorem ipsum etc]");
        System.out.println(novaReceita.getTitulo() + novaReceita.getTexto());

        Avaliacao novaAvaliacao = new Avaliacao(4, " ");
        System.out.println("Avaliação: " + novaAvaliacao.getNota() + " estrelas.");

        PalavraChave novaPalavra = new PalavraChave("abóbora");
        System.out.println("Palavra-chave: " + novaPalavra.getPalavra());
    }
}

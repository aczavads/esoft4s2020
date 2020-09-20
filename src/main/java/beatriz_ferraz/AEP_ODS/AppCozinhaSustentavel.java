package beatriz_ferraz.AEP_ODS;

public class AppCozinhaSustentavel {
    public static void main(String[] args) {
        
        System.out.println("Testando...");
        Receita novaReceita = new Receita("Chips de casca de abóbora","[lorem ipsum etc]");
       /*Avaliacao novaAvaliacao = new Avaliacao(4, " ");
        System.out.println("Avaliação: " + novaAvaliacao.getNota() + " estrelas.");*/

        PalavraChave abobora = new PalavraChave("abobora");
        PalavraChave casca = new PalavraChave("casca");
        PalavraChave snacks = new PalavraChave("snacks");
        //System.out.println("Palavra-chave: " + abobora.getPalavra());

        novaReceita.addPalavraChave(abobora);
        novaReceita.addPalavraChave(casca);
        novaReceita.addPalavraChave(snacks);
        System.out.println(novaReceita);
    }
}

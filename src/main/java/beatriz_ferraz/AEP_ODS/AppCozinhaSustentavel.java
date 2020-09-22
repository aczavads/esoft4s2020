package beatriz_ferraz.AEP_ODS;

public class AppCozinhaSustentavel {
    public static void main(String[] args) {
        
        System.out.println("Testando...");
        Receita novaReceita = new Receita("Chips de casca de abóbora","[lorem ipsum etc]");
       
        PalavraChave abobora = new PalavraChave("abobora");
        PalavraChave casca = new PalavraChave("casca");
        PalavraChave snacks = new PalavraChave("snacks");
        //System.out.println("Palavra-chave: " + abobora.getPalavra());

        novaReceita.addPalavraChave(abobora);
        novaReceita.addPalavraChave(casca);
        novaReceita.addPalavraChave(snacks);
        System.out.println(novaReceita);

        Avaliacao novaAvaliacao = new Avaliacao(4, " ");
        System.out.println("Avaliação: " + novaAvaliacao.getNota() + " estrelas.");

        /*Usuario novoUsuario = new Usuario("Ana Clara", "123456");
        System.out.println("Nome do usuário: " + novoUsuario.getNome()
                            + "\nSenha: " + novoUsuario.getSenha()); */   
    }
}
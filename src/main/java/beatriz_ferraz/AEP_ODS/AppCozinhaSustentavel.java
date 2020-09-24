package beatriz_ferraz.AEP_ODS;

import javax.swing.JOptionPane;

public class AppCozinhaSustentavel {
    public static void main(String[] args) {
        
        Usuario novoUsuario = new Usuario("Ana Clara Damini", "********");
        
        Receita novaReceita = new Receita("Chips de casca de abóbora","[lorem ipsum etc]");
       
        PalavraChave abobora = new PalavraChave("abobora");
        PalavraChave casca = new PalavraChave("casca");
        PalavraChave snacks = new PalavraChave("snacks"); 

        novaReceita.addPalavraChave(abobora);
        novaReceita.addPalavraChave(casca);

        System.out.println("Testando apresentação de uma receita: ");
        System.out.println(novaReceita);
        Avaliacao novaAvaliacao = new Avaliacao(4, " ");
        System.out.println("Avaliação: " + novaAvaliacao.getNota() + " estrelas.");

        System.out.println("\nTeste de pesquisa de palavra: ");
        novaReceita.existemReceitasComEssaPalavraChave(casca);

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nTestando usuário: ");
        System.out.println("Nome do usuário: " + novoUsuario.getNome()
                            + "\nSenha: " + novoUsuario.getSenha());   
    }
}
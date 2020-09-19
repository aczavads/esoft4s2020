package magno_toniolo.aula20200917.maisColeções;

import javax.swing.JOptionPane;

public class AppMaisColeções {
//aqui mensagem é um atributo de AppMaisColeções (foi declarada no corpo da classe)
    String mensagem;
    int atributoIdade;

//aqui mensagem é um parâmetro do método testar (foi declarada na lista de parâmetros)
public static void testar(String parâmetroMensagem, int parâmetroIdade) {
    //aqui mensagem é uma variável local (foi declarada no corpo do método testar)
    String mensagem;
    int variávelLocalIdade;
}

    public static void main(String[] args) {
        String nomeDigitado = "";
        do {
            nomeDigitado = JOptionPane.showInputDialog(null, "Digite um nome (ou <sair> para finalizar): ");
            if (nomeDigitado.equals("<sair>")) {
                break;
            }
            nomes.add(nomeDigitado);
        } while (true);

        for (String nome : nomes)
    }
    
}

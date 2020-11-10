package aula20200917.maisColeções;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aula20200908.associações.Pessoa;
import aula20200908.aula20200910.coleções.BoloDeChocolate;

public class AppMaisColeções {
    //aqui mensagem é um atributo de AppMaisColeções (foi declarada no corpo da classe)
    String atributoMensagem;
    int atributoIdade;

    //aqui mensagem é um parâmetro do método testar (foi declarada na lista de parâmetros do método testar)
    public static void testar(String parâmetroMensagem, int parâmetroIdade) {
        //aqui mensagem é uma variável local (foi declarada no corpo do método testar)
        String variávelLocalMensagem;
        int variávelLocalIdade;
    }



    public static void variáveisPrimitivasVariáveisReferência() {
        //Tipos primitivos, logo as variáveis armazenam valores primitivos.
        byte valorByte = 0;     //8 bits
        short valorShort = 0;   //16 bits
        int valorInt = 0;       //32 bits
        long valorLong = 0;     //64 bits
        float valorFloat = 0.00f;
        double valorDouble = 0.00d;
        boolean valorBoolean = false;
        char valorChar = 'a'; //ou um número, que representa o caracter.

        //Quando o tipo da variável é uma classe, então esta variável é uma referência (equivalente a um ponteiro)
        Byte referênciaParaByte = null; // ou Byte referênciaParaByte = 0;
        Short referênciaParaShort = null; 
        Integer referênciaParaInteger = null;
        Long referênciaParaLong = null;
        Float referênciaParaFloat = 10.25f;
        Double referênciaParaDouble = null;
        Boolean referênciaParaBoolean = null;
        Character referênciaParaCharacter = null;
        String referênciaParaString = "teste";
        Pessoa referênciaParaPessoa = null;
        BoloDeChocolate referênciaParaBoloDeChocolate = null;

        BoloDeChocolate boloDoHeitor = new BoloDeChocolate();
        BoloDeChocolate boloDaLaura = new BoloDeChocolate();
        BoloDeChocolate teste = boloDaLaura;
        List<BoloDeChocolate> bolos = new ArrayList<>();
        bolos.add(teste);
        bolos.add(teste);
        bolos.add(teste);
        bolos.add(teste);
        bolos.add(teste);
        bolos.add(teste);
        bolos.add(teste);
        bolos.add(teste);
        bolos.add(teste);
        bolos.add(teste);
    }


    public static void main(String[] args) {
        String nomeDigitado = "";
        List<String> nomes = new ArrayList<>();
        do {
            nomeDigitado = JOptionPane.showInputDialog(null, "Digite um nome (ou <sair> para finalizar): ");            
            if (nomeDigitado.equals("<sair>")) {
                break;
            } 
            nomes.add(nomeDigitado);
        } while (true);

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
    
}

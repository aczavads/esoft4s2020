package beatriz_ferraz.aula20200903;

import javax.swing.JOptionPane;

import beatriz_ferraz.aula20200903.valueObjects.Nome;

public class Pessoa {
   private Nome nome;

    public void getNome(){
        Nome nomeDigitado = new Nome(JOptionPane.showInputDialog(null, "Digite o nome: "));
        System.out.println(nomeDigitado);
    }

    public void setNome(Nome novoNome){
        this.nome = novoNome;
    }
}
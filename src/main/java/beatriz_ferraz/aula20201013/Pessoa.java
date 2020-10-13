package beatriz_ferraz.aula20201013;

import javax.swing.JOptionPane;

import beatriz_ferraz.aula20201013.ValueObject.Telefone;

public class Pessoa {
    private Telefone fone;

    public void getTelefone(){
        Telefone telefoneDigitado = new Telefone(JOptionPane.showInputDialog(null, "Digite o telefone: "));
        System.out.println(telefoneDigitado);
    }

    public void setTelefone(Telefone novoTelefone){
        this.fone = novoTelefone;
    }
}

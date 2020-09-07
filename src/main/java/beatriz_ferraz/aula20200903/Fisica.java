package beatriz_ferraz.aula20200903;

import javax.swing.JOptionPane;

import beatriz_ferraz.aula20200903.valueObjects.Cpf;

public class Fisica {
    private Cpf cpf;
    
    public void getCpf(){
        Cpf cpfDigitado = new Cpf(JOptionPane.showInputDialog(null, "Digite o CPF (apenas números):"));
        System.out.println(cpfDigitado);
    }

    public void setCpf(Cpf novoCpf){
        this.cpf = novoCpf;
    }
}

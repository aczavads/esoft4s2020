package beatriz_ferraz.aula20200903;

import javax.swing.JOptionPane;

import beatriz_ferraz.aula20200903.valueObjects.Cnpj;
import beatriz_ferraz.aula20200903.valueObjects.NomeFantasia;

public class Juridica {
    private Cnpj cnpj;
    private NomeFantasia nomeFantasia;

    public void getCnpj(){
        Cnpj cnpjDigitado = new Cnpj(JOptionPane.showInputDialog(null, "Digite o CNJP: "));
        System.out.println(cnpjDigitado);
    }

    public void setCnpj(Cnpj novoCnpj){
        this.cnpj = novoCnpj;
    }

    public void getNomeFantasia(){
        NomeFantasia nomeFantasiaDigitado = new NomeFantasia(JOptionPane.showInputDialog(null, "Digite o nome da empresa: "));
        System.out.println(nomeFantasiaDigitado);
    }

    public void setNomeFantasia(NomeFantasia novoNomeFantasia){
        this.nomeFantasia = novoNomeFantasia;
    }
}

package tiago_lopes_barcelos.aula20201013_Value_Object;

import javax.swing.JOptionPane;
import tiago_lopes_barcelos.aula20201013_Value_Object.voEmail.Email;

public class AppVOEmail {
    public static void main(String[] args) {
        Email emailInformado = new Email(JOptionPane.showInputDialog(null, "Informe E-mail: "));
        
        System.out.println("O E-mail informado é " + emailInformado);
    }
}

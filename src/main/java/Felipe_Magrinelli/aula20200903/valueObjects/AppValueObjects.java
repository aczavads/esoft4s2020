package Felipe_Magrinelli.aula20200903.valueObjects;

import javax.swing.*;

public class AppValueObjects {

    public static void main(String[] args) {
        Nome nomeDigitado = new Nome(JOptionPane.showInputDialog(null, "Digite o nome:"));
        System.out.println(nomeDigitado);
    }



}

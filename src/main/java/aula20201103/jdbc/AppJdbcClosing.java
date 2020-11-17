package aula20201103.jdbc;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AppJdbcClosing {

/*
    private static class MinhaClasse implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Olha, o close foi chamado sozinho pelo try with resources!");
        }
    }

    public static void main(String[] args) {
        try (MinhaClasse minha = new MinhaClasse()) {
            
        } catch (Exception e) {
        }
    }
*/
    
    public static void main(String[] args)  {
        //usando try with resources (específico da linguagem Java) para invocar o close automaticamente.
        boolean conectou = false;
        int tentativasDeConexão = 0;
        while (tentativasDeConexão < 10) {
            try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/esoft4s2020", "postgres", "postgres")) {
             if (System.currentTimeMillis()%2 == 0) {
                 throw new SQLException();
             }
             conectou = true;
             //Class.forName("org.postgresql.Driver");
             conn.setAutoCommit(false);
 
             // uso a conexão aqui neste espaço...
             
             String númeroInformado = JOptionPane.showInputDialog(null, "Informe um número");
             System.out.println(100 / Integer.parseInt(númeroInformado));
         } catch (Exception e) {
             e.printStackTrace();
         } 
         if (conectou) {
             break;
         } else {
             JOptionPane.showMessageDialog(null, "Olha, não conectou! Tentativa " + (tentativasDeConexão+1));
             tentativasDeConexão++;
         }
        }
        System.out.println("Fim!");
    }
    


    /*
    public static void main(String[] args) {
        Connection conn = null;
        try {
            //Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/esoft4s2020", "postgres", "postgres");
            conn.setAutoCommit(false);

            // uso a conexão aqui neste espaço...
            
            String númeroInformado = JOptionPane.showInputDialog(null, "Informe um número");
            System.out.println(100 / Integer.parseInt(númeroInformado));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            if (conn != null) {
                try {
                    conn.rollback();
                    conn.close();
                    System.out.println("Conexão fechada!");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Fim!");
    }
    */

}

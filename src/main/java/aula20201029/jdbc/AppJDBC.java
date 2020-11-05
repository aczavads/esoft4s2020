package aula20201029.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class AppJDBC {

    public static void main(String[] args) {
        try {
            long inicio = System.currentTimeMillis();
            //String exemploUrlSQLServer = "jdbc:sqlserver://localhost;databaseName=NOME_DO_BANCO;user=NOME_USUÁRIO;password=SENHA";
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/esoft4s2020", "postgres", "postgres");
            conn.setAutoCommit(false);

            try (Statement createTable =  conn.createStatement();) {
                createTable.executeUpdate("create table if not exists produto ("
                    +" id bigint not null primary key," 
                    +" descricao varchar(255) not null unique," 
                    +" preco numeric(10,2))");
            }               
            //createTable.close();

            try (PreparedStatement insertProduto = conn
                .prepareStatement("insert into produto (id, descricao, preco) values (?,?,?)");) {
                    for (int i = 1; i <= 1_000; i++) {
                        long novoId = System.nanoTime();
                        insertProduto.setLong(1, novoId);
                        insertProduto.setString(2, "Produto Descrição Boa, número " + novoId );
                        insertProduto.setDouble(3, 2.25 * i);
                        insertProduto.executeUpdate();
                    }            
                    //insertProduto.close();
                }
            
            conn.commit();

            Statement selectMaxId = conn.createStatement();
            ResultSet resultadoSelectMaxId = selectMaxId.executeQuery("select coalesce(max(id),-1) as maiorId from produto");
            if (resultadoSelectMaxId.next()) {
                Long maiorId = resultadoSelectMaxId.getLong("maiorId");
                if (maiorId != -1) {
                    PreparedStatement updateUltimoProduto = 
                        conn.prepareStatement("update produto set descricao = ? where id = ?");
                    updateUltimoProduto.setString(1, "Último produto! " + maiorId);
                    updateUltimoProduto.setLong(2, maiorId);
                    updateUltimoProduto.executeUpdate();
                    updateUltimoProduto.close();
                }
            }
            resultadoSelectMaxId.close();
            selectMaxId.close();
            conn.commit();

            Statement deletarProdutosComIdPar = conn.createStatement();
            deletarProdutosComIdPar.executeUpdate("delete from produto where id%2=0");
            JOptionPane.showMessageDialog(null, "Opa, esperando para fazer o commit do delete dos pares!");
            deletarProdutosComIdPar.close();
            conn.commit();




            System.out.println("Foi! Tempo total = " + (System.currentTimeMillis()-inicio) + " ms.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

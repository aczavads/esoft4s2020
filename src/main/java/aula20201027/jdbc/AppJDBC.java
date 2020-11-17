package aula20201027.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AppJDBC {

    public static void main(String[] args) {
        try {
            long inicio = System.currentTimeMillis();
            //String exemploUrlSQLServer = "jdbc:sqlserver://localhost;databaseName=NOME_DO_BANCO;user=NOME_USUÁRIO;password=SENHA";
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/esoft4s2020", "postgres", "postgres");
            conn.setAutoCommit(false);

            Statement createTable =  conn.createStatement();    
            
            createTable.executeUpdate("create table if not exists produto ("
                +" id bigint not null primary key," 
                +" descricao varchar(255) not null unique," 
                +" preco numeric(10,2))");

            PreparedStatement insertProduto = conn
                .prepareStatement("insert into produto (id, descricao, preco) values (?,?,?)");
            
            for (int i = 1; i <= 100; i++) {
                long novoId = System.nanoTime();
                insertProduto.setLong(1, novoId);
                insertProduto.setString(2, "Produto Descrição Boa, número " + novoId );
                insertProduto.setDouble(3, 2.25 * i);
                insertProduto.executeUpdate();
            }            
            conn.commit();

            System.out.println("Foi! Tempo total = " + (System.currentTimeMillis()-inicio) + " ms.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

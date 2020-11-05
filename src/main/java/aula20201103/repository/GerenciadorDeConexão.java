package aula20201103.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class GerenciadorDeConexão implements AutoCloseable {
    private Connection conexão = null;


    public GerenciadorDeConexão() throws SQLException {
        conexão = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/esoft4s2020", "postgres", "postgres");
            conexão.setAutoCommit(false);

            try (Statement createTable =  conexão.createStatement();) {
                createTable.executeUpdate("create table if not exists produto ("
                    +" id int not null primary key," 
                    +" modelo varchar2(255) not null," 
                    +" marca varchar2(255),"
                    +" amperagem numeric(100,2));");
            }
            try (PreparedStatement insertProduto = conexão
            .prepareStatement("insert into produto (id, modelo,amperagem) values (?,?,?)");) {
                for (int i = 1; i <= 1_000; i++) {
                    long novoId = System.nanoTime();
                    insertProduto.setLong(1, novoId);
                    insertProduto.setString(2, "AA");
                    insertProduto.setString(3, "AAA");
                    insertProduto.setDouble(4, 2.25 * i);
                    insertProduto.executeUpdate();
                }            
            }
    }

    public Connection getConexão() {
        return conexão;
    }

    @Override
    public void close() throws Exception {
        if (conexão != null) {
            conexão.close();
        }
    }

}

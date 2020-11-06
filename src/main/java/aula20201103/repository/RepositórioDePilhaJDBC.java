package aula20201103.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositórioDePilhaJDBC implements RepositórioDePilha {
    private Connection conexão;
    private PreparedStatement insert;

    public RepositórioDePilhaJDBC(Connection conexão) {
        this.conexão = conexão;
        criarTabela();
    }

    private void criarTabela() {        
        try (Statement createTable = conexão.createStatement()) {
            createTable.executeUpdate("create table if not exists pilha ("+
              "id char(36) not null primary key, " +
              "marca varchar(255) not null, "+
              "modelo varchar(255) not null, "+ 
              "amperagem integer not null " +
              ")");
            conexão.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void incluir(Pilha nova) {
        try {
            if (insert == null) {
                insert = conexão.prepareStatement("insert into pilha (id, marca, modelo, amperagem) values (?,?,?,?)");
            }
            insert.setString(1, nova.getId());
            insert.setString(2, nova.getMarca());
            insert.setString(3, nova.getModelo());
            insert.setInt(4, nova.getAmperagem());
            
            insert.executeUpdate();
            conexão.commit();            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Pilha> obterTodas() {
        List<Pilha> todas = new ArrayList<>();
        try (Statement select = conexão.createStatement();
            ResultSet resultado = select.executeQuery("select id, marca, modelo, amperagem from pilha")) {
            while (resultado.next()) {
                Pilha recuperada = new Pilha(
                    resultado.getString("id"),
                    resultado.getString("marca"),
                    resultado.getString("modelo"),
                    resultado.getInt("amperagem"));
                todas.add(recuperada);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return todas;
    }

    @Override
    public void close() throws Exception {
        System.out.println("RepositórioDePilhaJDBC fechando!!! :)");
        if (insert != null && !insert.isClosed()) {
            insert.close();
        }
    }

}

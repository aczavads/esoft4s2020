package Felipe_Magrinelli.aula20201027;

import java.sql.Connection;
import java.sql.DriverManager;

public class AppJDBC {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/POO2020 ", "postgres", "postgres");
            System.out.println("DEU CERTO");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

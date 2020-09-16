package magno_toniolo.aula20200910.coleções;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AppColeções {

    public static void main(String[] args) {
        List lista = new ArrayList();
        // List Lista = new LinkedList();
        lista.add("Ana Maria Braga");
        lista.add(new Date());
        lista.add(10);
        lista.add(new BoloDeChocolate());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println( lista.get(i) );
        }
        
    }
    
}

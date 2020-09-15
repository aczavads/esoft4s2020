package aula20200908.aula20200910.coleções;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AppColeções {

    public static void main(String[] args) {
        List lista = new ArrayList<>();
        //List lista = new LinkedList();
        lista.add("Ana Maria Braga");
        lista.add(new Date());
        lista.add(10);
        lista.add(new BoloDeChocolate());

        for (int i = 0; i < lista.size(); i++) {
            Object elemento = lista.get(i);
            if (elemento instanceof Integer && ((Integer)elemento) == 10) {
                System.out.println("Olha, tem um inteiro de valor 10 na lista! :D");
            }
            System.out.println( lista.get(i) );
        }

        List<BoloDeChocolate> listaDeBolo = new ArrayList<>();
        //List<BoloDeChocolate> listaDeBolo = new Vector<>();
        //List<BoloDeChocolate> listaDeBolo = new LinkedList<>();
        listaDeBolo.add(new BoloDeChocolate());
        listaDeBolo.add(new BoloDeChocolate());
        listaDeBolo.add(new BoloDeChocolate());
        listaDeBolo.add(new BoloDeChocolate());

        System.out.println("Tamanho: " + listaDeBolo.size());
        listaDeBolo.remove(0);
        System.out.println("Tamanho: " + listaDeBolo.size());




    }
    
}

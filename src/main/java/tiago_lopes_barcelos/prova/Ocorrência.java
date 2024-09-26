package tiago_lopes_barcelos.prova;

import java.util.Scanner;

public class Ocorrência {

    public static void main(String[] args) {
        
        Vítima pessoa = new Vítima("João");        

        NumOcorrência número = new NumOcorrência();  

        /*for (int cont = 1; cont <= 200; cont ++ ){ 
            número.num = número[cont];
        }*/
        número.num = 2;  
        
        System.out.println("Vítima: " + pessoa.getNome() + "\nOcorrência Nº.: " + número.num);
    }    
}

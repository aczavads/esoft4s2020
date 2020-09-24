package aula20200915.revisão;

public class AppRevisão {

    public static void main(String[] args) {
        //Invocando um construtor alternativo da classe Biblioteca que exige o nome como parâmetro.
        Biblioteca unicesumarMaringa = new Biblioteca(5, "Biblioteca D. Etelvina");

        //Invocando um construtor default(ou padrão) da classe Biblioteca que não exige parâmetros.
        Biblioteca unicesumarCuritiba = new Biblioteca();

        Object bibliotecaComoObject = new Biblioteca(3, "teste");

        System.out.println(unicesumarMaringa.getNome());
        System.out.println(unicesumarCuritiba.getNome());
        System.out.println(bibliotecaComoObject.toString());
        System.out.println("Novo teste");
        for (String string : args) {
            System.out.println(string);
        }
    }
    
}

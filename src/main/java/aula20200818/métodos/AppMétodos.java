package aula20200818.métodos;

public class AppMétodos {

    public static void main(String[] args) {
        System.out.println("Opa!!!!");
        OutraClasse.testarEstático(2);

        //Esta chamada de método não é possível pois o método testarNãoEstático não é static... :P
        //OutraClasse.testarNãoEstático(3);

        //Métodos não estáticos devem ser invocados/chamados/executados 
        //a partir de uma referência inicializadas (que aponta para um objeto/intância).
        OutraClasse instânciaDaOC = new OutraClasse();
        instânciaDaOC.testarNãoEstático(2);

        métodoVoid();
        boolean retorno = métodoComRetorno();
        System.out.println("métodoComRetorno retornou: " + retorno);
    }

    private static boolean métodoComRetorno() {
        for (int i = 0; i < 5;) {
            if (System.currentTimeMillis()%2 == 0) {
                return true;
            } else {
                throw new RuntimeException("Vixe, número ímpar!");
            }
        }
        return false;
    }

    public static void métodoVoid() {
        /*
        for (int i = 0; i < 5; i++) {
            if (System.currentTimeMillis()%2 == 0) {
                return;
            }
        }
        */
        System.out.println("método void executando...");
    }
    
}
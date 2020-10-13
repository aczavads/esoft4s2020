package beatriz_ferraz.prova20200929.exercicio3;

public class AppExercicioTres {

    public static void main(String[] args) {

        Carrinho carrinhoDoCliente1 = new Carrinho("item1");
        Carrinho carrinhoDoCliente2 = new Carrinho();

        for (int i = 0; i < 200; i++) {
            System.out.println(carrinhoDoCliente1.getClass());    
        }
    }
    
}

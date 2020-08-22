package aula20200818.métodos;

public class OutraClasse {

	public static void testarEstático(int quantidade) {
        System.out.println(">>>>");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Testando...");
        }
        System.out.println("<<<<");
	}

	public void testarNãoEstático(int quantidade) {
        OutraClasse.testarEstático(quantidade);
	}

}

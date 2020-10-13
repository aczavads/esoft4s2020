package magno_toniolo.teste;

public class teste {

    public static void main(String[] args) {

        Amigo magno = new Amigo("Magno"); // criamos o novo objeto do tipo Amigo("nome"), referenciado pela variável
                                          // magno
        Amigo[] amigos = new Amigo[200]; // criamos um array do tipo Amigo com 200 posições.

        for (int i = 0; i < amigos.length; ++i) {
            amigos[i] = magno; // neste loop, fazemos com que todas as variáveis de referência que estão no
                               // array "amigos" apontem para o objeto da classe Amigo referenciado por "magno"
        }

        for (int j = 0; j < amigos.length; j++) {

            System.out.println(amigos[j].getNome()); // aqui, imprimimos o "nome" do objeto que todas as referências
                                                     // estão apontando. No caso é o mesmo objeto referenciado por
                                                     // "magno", por isso o console imprime 200 vezes o nome "Magno"
        }
    }
}
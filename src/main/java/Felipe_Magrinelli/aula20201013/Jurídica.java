package Felipe_Magrinelli.aula20201013;

public class Jurídica extends Pessoa {
    public Jurídica(String josé_de_almeida, String s) {
        super(josé_de_almeida, s);
    }

    public static class Fornecedor{
        double desconto;
        public Fornecedor(double Desconto){
            this.desconto = desconto;
        }
    }

    public static class Transportadora{
        public Transportadora(){

        }
    }
}

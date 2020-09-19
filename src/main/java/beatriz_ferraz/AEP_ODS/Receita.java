package beatriz_ferraz.AEP_ODS;

public class Receita {
   
    private String titulo;
    private String texto;
    //private Palavra palavraChave;
    //private Avaliacao avaliacao;

    public Receita (String titulo, String texto) {
        setTitulo(titulo);
        setTexto(texto);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

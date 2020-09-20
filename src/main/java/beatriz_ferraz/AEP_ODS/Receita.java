package beatriz_ferraz.AEP_ODS;

import java.util.ArrayList;
import java.util.List;

public class Receita {
   
    private String titulo;
    private String texto;
    private List<PalavraChave> palavrasChave = new ArrayList<>(); 
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private double mediaDasAvaliacoes;

    public Receita (String titulo, String texto) {
        setTitulo(titulo);
        setTexto(texto);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
       if(titulo == null || titulo.trim().length() <= 1) {
          throw new RuntimeException("Título inválido.");
       }
       this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void addPalavraChave(PalavraChave novaPalavraChave) {
        this.palavrasChave.add(novaPalavraChave);
    }

    public void addAvaliacoes(Avaliacao novaAvaliacao) {
        this.avaliacoes.add(novaAvaliacao);
    }

    @Override
    public String toString() {
        String stringPalavrasChave = "Palavras-chave: ";
        for (PalavraChave p : this.palavrasChave) {
            stringPalavrasChave += p.toString() + "; ";
        }

        return "Título da Receita: " + titulo + "\n" 
                + "Texto: " + texto + "\n"
                + stringPalavrasChave.substring(0,stringPalavrasChave.length());
    }
}

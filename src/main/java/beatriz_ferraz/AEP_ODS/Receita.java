package beatriz_ferraz.AEP_ODS;

import java.util.ArrayList;
import java.util.List;

public class Receita {
   
    private String titulo;
    private String texto;
    private List<PalavraChave> palavrasChave = new ArrayList<>(); 
    private PalavraChave palavraPesquisada; 

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

    public void existemReceitasComEssaPalavraChave(PalavraChave palavraPesquisada) {
        boolean achouPalavra = false;
        for (PalavraChave p : this.palavrasChave) {
            final boolean palavraIgual = p.getPalavra().equals(palavraPesquisada.getPalavra());
            if(palavraIgual) {
                achouPalavra = true;
                System.out.println("Existem receitas relacionadas a " + palavraPesquisada + ".");
                break;
            } 
        }
        if(!achouPalavra) {
            throw new RuntimeException("Nenhum resultado encontrado.");
        }
        this.palavraPesquisada =  palavraPesquisada;
    }

    public PalavraChave getExistemReceitasComEssaPalavraChave() {
        return palavraPesquisada;
    }
}

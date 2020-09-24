package beatriz_ferraz.AEP_ODS;

public class Avaliacao {
    
    private int nota;
    private String comentario;

    public Avaliacao(int nota, String comentario) {
        setNota(nota);
        setComentario(comentario);
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota < 1 || nota > 5) {
            throw new RuntimeException("Nota deve ser entre 1 e 5.");
        }
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        if(comentario.length() > 1000) {
            throw new RuntimeException("Comentário não deve ultrapassar 1000 caracteres.");
        }
        this.comentario = comentario;
    }
}


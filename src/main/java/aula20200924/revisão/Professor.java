package aula20200924.revisão;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Professor {

    private String nome;
    private Set<Disciplina> disciplinasMinistradas =  new HashSet<>();

    public Professor(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

	public void addDisciplinaMinistrada(Disciplina disciplina) {
        if (disciplinasMinistradas.contains(disciplina)) {
            return;
        }
        disciplinasMinistradas.add(disciplina);
        disciplina.setProfessor(this);
    }
    
    public List<Disciplina> getDisciplinasMinistradas() {
        return new ArrayList<>(disciplinasMinistradas);
    }

}

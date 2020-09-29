package aula20200924.revisão;

public class AppRevisão {

    public static void main(String[] args) {
        Professor marcello = new Professor("Marcello Erick Bonfim");

        Disciplina tcc = new Disciplina("Trabalho de Conclusão de Curso");
        Disciplina ed = new Disciplina("Estrutura de Dados");

        marcello.addDisciplinaMinistrada(tcc);
        marcello.addDisciplinaMinistrada(ed);
        //tcc.setProfessor(marcello);
        //ed.setProfessor(marcello);

        for (Disciplina ministrada : marcello.getDisciplinasMinistradas()) {
            System.out.println("  " + ministrada.getNome() + " ministada por " + ministrada.getProfessor().getNome());
        }


        
    }
    
}

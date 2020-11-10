package aula20200922.associaçõesUnique;

public class AppAssociaçõesUnique {

    public static void main(String[] args) {
        Professor cidão = new Professor("Aparecido Vilela Júnior");

        Disciplina bd = new Disciplina("Banco de Dados");
        Disciplina po = new Disciplina("Pesquisa Operacional");
        Disciplina ps = new Disciplina("Projeto de Sistemas");
        Disciplina ac = new Disciplina("Arquitetura de Computadores");

        cidão.addDisciplinaMinistrada(bd);
        cidão.addDisciplinaMinistrada(po);
        cidão.addDisciplinaMinistrada(new Disciplina("Pesquisa Operacional"));
        cidão.addDisciplinaMinistrada(new Disciplina("Pesquisa Operacional"));
        cidão.addDisciplinaMinistrada(ps);
        cidão.addDisciplinaMinistrada(ac);

        for (Disciplina d : cidão.getDisciplinasMinistradas()) {
            System.out.println(d.getNome() + "  Professor: " + d.getProfessor().getNome() );
        }
    }
    
}

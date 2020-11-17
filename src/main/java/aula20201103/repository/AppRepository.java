package aula20201103.repository;

public class AppRepository {

    public static void main(String[] args)  {
        try (GerenciadorDeConexão gerenciadorConexão = new GerenciadorDeConexão(); 
             //RepositórioDePilha pilhaRepo = new RepositórioDePilhaEmMemória();
             RepositórioDePilha pilhaRepo = new RepositórioDePilhaJDBC(gerenciadorConexão.getConexão());
             ) {
             
            Pilha philipsAAARecarregável = new Pilha("Philips", "AAA", 950);
            Pilha sonyAARecarregável = new Pilha("Sony", "AA", 2450);
            
            pilhaRepo.incluir(philipsAAARecarregável);
            pilhaRepo.incluir(sonyAARecarregável);

            for (Pilha p : pilhaRepo.obterTodas()) {
                System.out.println(p.toString());
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
}

package Felipe_Magrinelli.aula20201022;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Pessoa {
    private String id;
    private String nome;
    private List<Papel> papéis = new ArrayList<>();

    public Pessoa(){
        this.id = UUID.randomUUID().toString();
    }

    public Pessoa(String nome){
        this();
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void assumirPapel(Papel papel){
        for(Papel papel_existente: papéis){
            if(papel_existente.getClass().equals(papel.getClass())){
                throw new RuntimeException("Essa pessoa ja possui o papel [ " + papel.getClass().getSimpleName() + " ]");
            }
        }
        this.papéis.add(papel);
    }

    public boolean isReitor(){
        for(Papel papel: papéis){
            if(papel instanceof Reitor){
                return true;
            }
        }
        return false;
    }

    public Reitor getReitor(){
        for(Papel papel : papéis){
            if(papel instanceof Reitor){
                return (Reitor) papel;
            }
        }
        return null;
    }

    public boolean isCliente(){
        for(Papel papel : papéis){
            if(papel instanceof Cliente){
                return true;
            }
        }
        return false;
    }
}

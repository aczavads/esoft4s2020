package Felipe_Magrinelli.aula20201015;

import java.util.UUID;

public class Pessoa {
    private String id;
    private String nome;
    private Reitor reitor;

    public Pessoa(String nome){
        this.nome = nome;
        this.id = UUID.randomUUID().toString();
    }

    public String getId(){
        return id;
    }

    /*public void setReitor(Reitor){

    }*/

    public boolean isReitor(){
        return true;
    }

    public Reitor getReitor(){
        return reitor;
    }
}

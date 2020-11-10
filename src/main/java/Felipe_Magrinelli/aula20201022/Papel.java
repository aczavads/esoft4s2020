package Felipe_Magrinelli.aula20201022;

import java.util.UUID;

public abstract class Papel {
    private String id;

    public Papel(){
        id = UUID.randomUUID().toString();
    }

    public String getId(){
        return id;
    }
}

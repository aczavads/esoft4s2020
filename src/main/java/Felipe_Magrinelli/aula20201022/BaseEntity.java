package Felipe_Magrinelli.aula20201022;

import java.util.UUID;

public class BaseEntity {
    private String id;

    public BaseEntity(){
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return id;
    }
}

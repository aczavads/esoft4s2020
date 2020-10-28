package aula20201022.modeloOOMercado;

import java.util.UUID;

public abstract class BaseEntity {
    private String id;


    public BaseEntity() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

}

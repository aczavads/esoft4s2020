package aula20201112.modeloOOMercadoPersistente.pessoa.papel;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import aula20201112.modeloOOMercadoPersistente.BaseEntity;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Papel extends BaseEntity {

    public Papel() {
        super();
    }

}

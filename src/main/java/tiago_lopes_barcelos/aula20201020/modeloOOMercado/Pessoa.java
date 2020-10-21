package tiago_lopes_barcelos.aula20201020.modeloOOMercado;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Pessoa {
    private String id;
    private String nome;
    private List<Papel> papéis = new ArrayList<>();

    public Pessoa() {
        this.id = UUID.randomUUID().toString();
    }

    public Pessoa(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void assumirPapel(Papel papel) {
        for (Papel papelExistente : papéis) {
            if (papelExistente.getClass().equals(papel.getClass())) {
                throw new RuntimeException("Esta pessoa já possuí o papel [" + papel.getClass().getSimpleName()  +"]");
            }
        }
        this.papéis.add(papel);
    }
   
    public boolean isReitor() {
        for (Papel papel : papéis) {
            if (papel instanceof Reitor) {
                return true;
            }
        }
        return false;
    }

    public Reitor getReitor() {
        for (Papel papel : papéis) {
            if (papel instanceof Reitor) {
                return (Reitor) papel;
            }
        }
        return null;
    }

    public boolean isCliente() {
        for (Papel papel : papéis) {
            if (papel instanceof Cliente) {
                return true;
            }
        }
        return false;
    }

    public Cliente getDescontoCliente() {
        for (Papel papel : papéis) {
            if (papel instanceof Cliente) {
                return (Cliente) papel;
            }
        }
        return null;
    }    

    public Cliente getLimiteDeCrédito() {
        for (Papel papel : papéis) {
            if (papel instanceof Cliente) {
                return (Cliente) papel;
            }
        }
        return null;
    }

    public boolean isFornecedor() {
        for (Papel papel : papéis) {
            if (papel instanceof Fornecedor) {
                return true;
            }
        }
        return false;
    }

    public Fornecedor getDescontoFornecedor() {
        for (Papel papel : papéis) {
            if (papel instanceof Fornecedor) {
                return (Fornecedor) papel;
            }
        }
        return null;
    }

    public boolean isVendedor() {
        for (Papel papel : papéis) {
            if (papel instanceof Vendedor) {
                return true;
            }
        }
        return false;
    }

    public Vendedor getVendedor() {
        for (Papel papel : papéis) {
            if (papel instanceof Vendedor) {
                return (Vendedor) papel;
            }
        }
        return null;
    }

    public boolean isTransportadora() {
        for (Papel papel : papéis) {
            if (papel instanceof Transportadora) {
                return true;
            }
        }
        return false;
    }

    public Transportadora getTransportadora() {
        for (Papel papel : papéis) {
            if (papel instanceof Transportadora) {
                return (Transportadora) papel;
            }
        }
        return null;
    }
}

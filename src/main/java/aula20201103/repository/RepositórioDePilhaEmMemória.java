package aula20201103.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositórioDePilhaEmMemória implements RepositórioDePilha {
    private Map<String, Pilha> dados = new HashMap<>();

    @Override
    public void incluir(Pilha nova) {
        if (dados.containsKey(nova.getId())) {
            throw new RuntimeException("Chave duplicada! Já existe uma pilha com o id [" + nova.getId() + "]");
        }
        dados.put(nova.getId(), nova);
    }

    @Override
    public List<Pilha> obterTodas() {
        return new ArrayList<>(dados.values());
    }

}

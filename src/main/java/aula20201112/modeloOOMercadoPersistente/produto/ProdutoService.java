package aula20201112.modeloOOMercadoPersistente.produto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProdutoService {
    @Autowired
    private ProdutoRepository repo;

    public void criarProdutos() {
        repo.save(new Produto("Fralda Pampers Confort Sec XXG 56 tiras"));
        repo.save(new Produto("Fralda Pampers Confort Sec G 68 tiras"));
        repo.save(new Produto("Costela Minga Especial"));
        repo.save(new Produto("Cerveja Heineken Long Neck"));
    }

	public List<Produto> obterTodos() {
		return repo.findAll();
	}

	public Produto findById(String id) {
		return repo.findById(id).get();
	}

}

package aula20201112.modeloOOMercadoPersistente.produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
    
}

package aula20201112.modeloOOMercadoPersistente.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PessoaRepository extends JpaRepository<Pessoa, String> {

    @Query(value = "select f from Fisica f where f.cpf = :cpf")
	Fisica findFísicaByCpf(String cpf);
    
}

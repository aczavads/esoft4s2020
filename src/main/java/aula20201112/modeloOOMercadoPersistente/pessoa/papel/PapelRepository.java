package aula20201112.modeloOOMercadoPersistente.pessoa.papel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PapelRepository extends JpaRepository<Papel, String> {
    
}

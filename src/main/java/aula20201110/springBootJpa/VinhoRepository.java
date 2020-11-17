package aula20201110.springBootJpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VinhoRepository extends JpaRepository<Vinho, String> {
 
}

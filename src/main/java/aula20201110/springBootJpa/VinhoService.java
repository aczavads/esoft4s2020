package aula20201110.springBootJpa;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VinhoService {
    @Autowired
    private VinhoRepository repo;

    public void criarVinhos() {
        for (int i = 1; i <= 200; i++) {
            repo.save(new Vinho("Santa Alice Reservado Garrafa" + i, "Malbec", 2015));
        }
    }

    public String sayHello() {
        return "Hello!";
    }

	public List<Vinho> obterTodos() {
		return repo.findAll();
	}

}

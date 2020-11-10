package aula20201103.repository;

import java.util.List;

public interface RepositórioDePilha extends AutoCloseable {

	void incluir(Pilha nova);
	List<Pilha> obterTodas();

}

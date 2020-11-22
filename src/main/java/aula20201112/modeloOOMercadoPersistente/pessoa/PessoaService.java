package aula20201112.modeloOOMercadoPersistente.pessoa;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula20201112.modeloOOMercadoPersistente.pessoa.papel.Papel;

@Service
@Transactional
public class PessoaService {
    @Autowired
    private PessoaRepository repo;

    public void criarPessoas() {
        repo.save(new Fisica("Analice Beatrice Cardoso", "065.578.187-44"));
        repo.save(new Fisica("Jonas Castro Alves", "111.577187-01"));
        repo.save(new Juridica("Dados e Fatos Ltda.", "45.454.545/0001-55"));
        repo.save(new Juridica("Oracle Corp Brasil", "45.454.545/0001-55"));
    }

	public List<Pessoa> obterTodas() {
		return repo.findAll();
    }

    public Fisica encontrarPeloCpf(String cpf) {
        return repo.findFísicaByCpf(cpf);
    }

	public Fisica atribuirPapelFisicaPeloCpf(String cpf, Papel novoPapel) {
        Fisica f = repo.findFísicaByCpf(cpf);	
        f.assumirPapel(novoPapel);
        repo.save(f);
        return f;
    }
    
}

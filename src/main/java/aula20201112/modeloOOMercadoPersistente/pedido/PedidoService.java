package aula20201112.modeloOOMercadoPersistente.pedido;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PedidoService {
    @Autowired
    private PedidoRepository repo;

    public List<Pedido> getAll() {
        return repo.findAll();
    }

    public void save(Pedido novo) {
        repo.save(novo);
    }

    public void deleteById(String id) {
        repo.deleteById(id);
    }

	public Pedido findById(String id) {
		return repo.findById(id).get();
	}

}

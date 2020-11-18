package aula20201112.modeloOOMercadoPersistente.pedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, String> {
    
}

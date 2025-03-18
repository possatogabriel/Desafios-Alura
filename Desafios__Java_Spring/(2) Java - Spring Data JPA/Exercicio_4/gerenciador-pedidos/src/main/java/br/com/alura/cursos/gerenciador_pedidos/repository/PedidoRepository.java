package br.com.alura.cursos.gerenciador_pedidos.repository;

import br.com.alura.cursos.gerenciador_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

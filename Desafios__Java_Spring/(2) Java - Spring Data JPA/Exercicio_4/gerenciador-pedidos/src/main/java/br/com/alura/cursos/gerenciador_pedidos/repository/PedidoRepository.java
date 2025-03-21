package br.com.alura.cursos.gerenciador_pedidos.repository;

import br.com.alura.cursos.gerenciador_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByDataIsNull();

    List<Pedido> findByDataIsNotNull();

    List<Pedido> findByDataAfter(LocalDate data);

    List<Pedido> findByDataBefore(LocalDate data);

    List<Pedido> findByDataBetween(LocalDate dataInicio, LocalDate dataFim);
}

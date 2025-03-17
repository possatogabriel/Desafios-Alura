package br.com.alura.cursos.gerenciador_pedidos.repository;

import br.com.alura.cursos.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNome(String nome);

    List<Produto> findByCategoriaNome(String categoria);

    List<Produto> findByPrecoGreaterThanEqual(double preco);

    List<Produto> findByPrecoLessThanEqual(double preco);

    List<Produto> findByNomeContaining(String nome);
}

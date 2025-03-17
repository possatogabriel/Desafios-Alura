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

    List<Produto> findByCategoriaNomeOrderByPrecoAsc(String categoria);

    List<Produto> findByCategoriaNomeOrderByPrecoDesc(String categoria);

    List<Produto> countByCategoriaNome(String categoria);

    List<Produto> countByPrecoGreaterThan(double preco);

    List<Produto> findByPrecoLessThanAndNomeContaining(double preco, String nome);

    List<Produto> findTop3ByPrecoDesc();

    List<Produto> findTop1ByCategoriaNomeOrderByPrecoAsc(String categoria);
}

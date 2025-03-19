package br.com.alura.cursos.gerenciador_pedidos.repository;

import br.com.alura.cursos.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT p FROM Produto p WHERE p.preco > :valor")
    List<Produto> achaProdutosPorPrecoMaiorQue(double valor);

    @Query("SELECT p FROM Produto p ORDER BY p.preco ASC")
    List<Produto> ordenaProdutosPorPrecoCrescente();

    @Query("SELECT p FROM Produto p ORDER BY p.preco DESC")
    List<Produto> ordenaProdutosPorPrecoDecrescente();

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:letra%")
    List<Produto> achaProdutoPorNomeComecandoCom(String letra);

    @Query("SELECT AVG(p.preco) FROM Produto p")
    double calculaMediaDePrecos();

    @Query("SELECT MAX(p.preco) FROM Produto p WHERE p.categoria.nome = :categoria")
    double achaProdutoMaisCaroPorCategoria(@Param("categoria") String categoria);

    @Query("SELECT c.nome, COUNT(p) FROM Produto p JOIN p.categoria c GROUP BY c.nome")
    List<Object[]> contaProdutoPorCategoria();

    @Query("SELECT c.nome, COUNT(p) FROM Produto p JOIN p.categoria c GROUP BY c.nome HAVING COUNT(p) > :produtos")
    List<Object[]> achaCategoriasComMaisDe(int produtos);

    @Query("SELECT p FROM Produto p WHERE p.nome ILIKE %:trecho% OR p.categoria.nome ILIKE %:trecho%")
    List<Produto> achaProdutoPorNomeOuPorCategoria(String trecho);

    @Query(value = "SELECT * FROM produtos ORDER BY valor DESC LIMIT 5", nativeQuery = true)
    List<Produto> achaTop5ProdutosMaisCaros();
}

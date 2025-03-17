package br.com.alura.cursos.gerenciador_pedidos.repository;

import br.com.alura.cursos.gerenciador_pedidos.model.Categoria_4;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository_7 extends JpaRepository<Categoria_4, Long> {
    // 7. Agora, iremos querer salvar dados no banco. Por isso, você deve criar vários repositórios diferentes: um para Pedido, outro para Produto e outro para Categoria.
}

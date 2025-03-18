package br.com.alura.cursos.gerenciador_pedidos.repository;

import br.com.alura.cursos.gerenciador_pedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

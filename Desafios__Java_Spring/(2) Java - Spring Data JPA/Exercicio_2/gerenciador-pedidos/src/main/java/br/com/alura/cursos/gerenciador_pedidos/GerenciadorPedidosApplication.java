package br.com.alura.cursos.gerenciador_pedidos;

import br.com.alura.cursos.gerenciador_pedidos.main.Main;
import br.com.alura.cursos.gerenciador_pedidos.repository.CategoriaRepository_7;
import br.com.alura.cursos.gerenciador_pedidos.repository.PedidoRepository_7;
import br.com.alura.cursos.gerenciador_pedidos.repository.ProdutoRepository_7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository_7 categoriaRepositorio;

	@Autowired
	private PedidoRepository_7 pedidoRepositorio;

	@Autowired
	private ProdutoRepository_7 produtoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main programa = new Main(categoriaRepositorio, pedidoRepositorio, produtoRepositorio);
		programa.rodaAplicacao();
	}
}

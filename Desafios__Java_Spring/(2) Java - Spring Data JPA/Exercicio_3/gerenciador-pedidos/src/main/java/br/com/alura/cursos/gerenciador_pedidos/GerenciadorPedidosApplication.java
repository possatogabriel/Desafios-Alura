package br.com.alura.cursos.gerenciador_pedidos;

import br.com.alura.cursos.gerenciador_pedidos.main.Main;
import br.com.alura.cursos.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.FornecedorRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.PedidoRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepositorio;

	@Autowired
	private PedidoRepository pedidoRepositorio;

	@Autowired
	private ProdutoRepository produtoRepositorio;

	@Autowired
	private FornecedorRepository fornecedorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main programa = new Main(categoriaRepositorio, pedidoRepositorio, produtoRepositorio, fornecedorRepositorio);
		programa.rodaAplicacao();
	}
}

package br.com.alura.cursos.gerenciador_pedidos.main;

import br.com.alura.cursos.gerenciador_pedidos.model.Categoria;
import br.com.alura.cursos.gerenciador_pedidos.model.Fornecedor;
import br.com.alura.cursos.gerenciador_pedidos.model.Produto;
import br.com.alura.cursos.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.FornecedorRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.PedidoRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Main {
    private CategoriaRepository categoriaRepositorio;
    private PedidoRepository pedidoRepositorio;
    private ProdutoRepository produtoRepositorio;
    private FornecedorRepository fornecedorRepositorio;

    public Main(CategoriaRepository categoriaRepositorio, PedidoRepository pedidoRepositorio, ProdutoRepository produtoRepositorio, FornecedorRepository fornecedorRepositorio) {
        this.categoriaRepositorio = categoriaRepositorio;
        this.pedidoRepositorio = pedidoRepositorio;
        this.produtoRepositorio = produtoRepositorio;
        this.fornecedorRepositorio = fornecedorRepositorio;
    }

    public void rodaAplicacao() {
        Categoria eletronicos = new Categoria("Eletrônicos");
        Categoria moveis = new Categoria("Móveis");
        categoriaRepositorio.saveAll(List.of(eletronicos, moveis));

        Fornecedor fornecedorEletronicos = new Fornecedor("Tech Fornece");
        Fornecedor fornecedorMoveis = new Fornecedor("Seus Móveis");
        fornecedorRepositorio.saveAll(List.of(fornecedorEletronicos, fornecedorMoveis));

        Produto produto1 = new Produto("Computador", 1599.99, eletronicos, fornecedorEletronicos);
        Produto produto2 = new Produto("Televisão", 699.99, eletronicos, fornecedorEletronicos);
        Produto produto3 = new Produto("Sofá", 599.99, moveis, fornecedorMoveis);
        produto1.setFornecedor(fornecedorEletronicos);
        produto2.setFornecedor(fornecedorEletronicos);
        produto3.setFornecedor(fornecedorMoveis);
        eletronicos.setProdutos(List.of(produto1, produto2));
        moveis.setProdutos(List.of(produto3));
        produtoRepositorio.saveAll(List.of(produto1, produto2, produto3));

        rodaExercicio1();

        rodaExercicio2();

        rodaExercicio3();

        rodaExercicio4();

        rodaExercicio5();
    }

    private void rodaExercicio1() {
        // 1. Retorne todos os produtos com o nome exato fornecido.

        var produtos = produtoRepositorio.findByNome("Computador");
        produtos.forEach(p -> System.out.println("(1) " + p));
    }

    private void rodaExercicio2() {
        // 2. Retorne todos os produtos associados a uma categoria específica.

        var produtos = produtoRepositorio.findByCategoriaNome("Eletrônicos");
        produtos.forEach(p -> System.out.println("(2) " + p));
    }

    private void rodaExercicio3() {
        // 3. Retorne produtos com preço maior que o valor fornecido.

        var produtos = produtoRepositorio.findByPrecoGreaterThanEqual(650.00);
        produtos.forEach(p -> System.out.println("(3) " + p));
    }

    private void rodaExercicio4() {
        // 4. Retorne produtos com preço menor que o valor fornecido.

        var produtos = produtoRepositorio.findByPrecoLessThanEqual(600.00);
        produtos.forEach(p -> System.out.println("(4) " + p));
    }

    private void rodaExercicio5() {
        // 5. Retorne produtos cujo nome contenha o termo especificado.

        var produtos = produtoRepositorio.findByNomeContaining("Sof");
        produtos.forEach(p -> System.out.println("(5) " + p));
    }
}

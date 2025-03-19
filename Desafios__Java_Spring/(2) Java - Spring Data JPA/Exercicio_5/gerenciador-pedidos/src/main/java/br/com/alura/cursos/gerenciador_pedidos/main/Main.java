package br.com.alura.cursos.gerenciador_pedidos.main;

import br.com.alura.cursos.gerenciador_pedidos.model.Categoria;
import br.com.alura.cursos.gerenciador_pedidos.model.Fornecedor;
import br.com.alura.cursos.gerenciador_pedidos.model.Pedido;
import br.com.alura.cursos.gerenciador_pedidos.model.Produto;
import br.com.alura.cursos.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.FornecedorRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.PedidoRepository;
import br.com.alura.cursos.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
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

    private void criaNovoBanco() {
        pedidoRepositorio.deleteAll();
        produtoRepositorio.deleteAll();
        categoriaRepositorio.deleteAll();
        fornecedorRepositorio.deleteAll();

        Categoria eletronicos = new Categoria("Eletrônicos");
        Categoria moveis = new Categoria("Móveis");
        categoriaRepositorio.saveAll(List.of(eletronicos, moveis));

        Fornecedor fornecedorEletronicos = new Fornecedor("Tech Fornece");
        Fornecedor fornecedorMoveis = new Fornecedor("Seus Móveis");
        fornecedorRepositorio.saveAll(List.of(fornecedorEletronicos, fornecedorMoveis));

        Produto produto1 = new Produto("Computador", 1599.99, eletronicos, fornecedorEletronicos);
        Produto produto2 = new Produto("Televisão", 699.99, eletronicos, fornecedorEletronicos);
        Produto produto3 = new Produto("Sofá", 599.99, moveis, fornecedorMoveis);
        Produto produto4 = new Produto("Cadeira", 59.99, moveis, fornecedorMoveis);
        produto1.setFornecedor(fornecedorEletronicos);
        produto2.setFornecedor(fornecedorEletronicos);
        produto3.setFornecedor(fornecedorMoveis);
        produto4.setFornecedor(fornecedorMoveis);
        eletronicos.setProdutos(List.of(produto1, produto2));
        moveis.setProdutos(List.of(produto3, produto4));
        produtoRepositorio.saveAll(List.of(produto1, produto2, produto3, produto4));

        Pedido pedido1 = new Pedido(LocalDate.of(2025, 03, 17), List.of(produto1, produto3));
        Pedido pedido2 = new Pedido(LocalDate.of(2025, 01, 01), List.of(produto2));
        pedido1.setProdutos(List.of(produto1, produto3));
        pedido2.setProdutos(List.of(produto2));
        pedidoRepositorio.saveAll(List.of(pedido1, pedido2));
    }

    public void rodaAplicacao() {
        criaNovoBanco();

        rodaExercicio1();

        rodaExercicio2();

        rodaExercicio3();

        rodaExercicio4();

        rodaExercicio5();

        rodaExercicio6();

        rodaExercicio7();

        rodaExercicio8();

        rodaExercicio9();

        rodaExercicio10();

        rodaExercicio11();
    }

    private void rodaExercicio1() {
        // 1. Crie uma consulta que retorne os produtos com preço maior que um valor

        var produtos = produtoRepositorio.achaProdutosPorPrecoMaiorQue(500.00);
        produtos.forEach(p -> System.out.println("\n(1) " + p));
    }

    private void rodaExercicio2() {
        // 2. Crie uma consulta que retorne os produtos ordenados pelo preço crescente.

        var produtos = produtoRepositorio.ordenaProdutosPorPrecoCrescente();
        produtos.forEach(p -> System.out.println("\n(2) " + p));
    }

    private void rodaExercicio3() {
        // 3. Crie uma consulta que retorne os produtos ordenados pelo preço decrescente.

        var produtos = produtoRepositorio.ordenaProdutosPorPrecoDecrescente();
        produtos.forEach(p -> System.out.println("\n(3) " + p));
    }

    private void rodaExercicio4() {
        // 4. Crie uma consulta que retorne os produtos que comecem com uma letra específica.

        var produtos = produtoRepositorio.achaProdutoPorNomeComecandoCom("T");
        produtos.forEach(p -> System.out.println("\n(4) " + p));
    }

    private void rodaExercicio5() {
        // 5. Crie uma consulta que retorne os pedidos feitos entre duas datas.

        var pedidos = pedidoRepositorio.achaPedidoPorDataEntre(LocalDate.of(2025, 01, 01), LocalDate.now());
        pedidos.forEach(p -> System.out.println("\n(5) " + p));
    }

    private void rodaExercicio6() {
        // 6. Crie uma consulta que retorne a média de preços dos produtos.

        var produtos = produtoRepositorio.calculaMediaDePrecos();
        System.out.println("(6) " + produtos);
    }

    private void rodaExercicio7() {
        // 7. Crie uma consulta que retorne o preço máximo de um produto em uma categoria

        var produtos = produtoRepositorio.achaProdutoMaisCaroPorCategoria("Eletrônicos");
        System.out.println("\n(7) " + produtos);
    }

    private void rodaExercicio8() {
        // 8. Crie uma consulta para contar o número de produtos por categoria.

        var produtos = produtoRepositorio.contaProdutoPorCategoria();
        produtos.forEach(p -> System.out.println("\n(8) " + Arrays.toString(p)));
    }

    private void rodaExercicio9() {
        // 9. Crie uma consulta para filtrar categorias com mais de 10 produtos.

        var produtos = produtoRepositorio.achaCategoriasComMaisDe(10);
        produtos.forEach(p -> System.out.println("\n(9) " + Arrays.toString(p)));
    }

    private void rodaExercicio10() {
        // 10. Crie uma consulta para retornar os produtos filtrados por nome ou por categoria.

        var produtos = produtoRepositorio.achaProdutoPorNomeOuPorCategoria("Móv");
        produtos.forEach(p -> System.out.println("\n(10) " + p));
    }

    private void rodaExercicio11() {
        // 11. Crie uma consulta nativa para buscar os cinco produtos mais caros

        var produtos = produtoRepositorio.achaTop5ProdutosMaisCaros();
        produtos.forEach(p -> System.out.println("\n(11) " + p));
    }
}
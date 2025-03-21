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

        rodaExercicio12();

        rodaExercicio13();

        rodaExercicio14();

        rodaExercicio15();

        rodaExercicio16();

        rodaExercicio17();
    }

    private void rodaExercicio1() {
        // 1. Retorne todos os produtos com o nome exato fornecido.

        var produtos = produtoRepositorio.findByNome("Computador");
        produtos.forEach(p -> System.out.println("\n(1) " + p));
    }

    private void rodaExercicio2() {
        // 2. Retorne todos os produtos associados a uma categoria específica.

        var produtos = produtoRepositorio.findByCategoriaNome("Eletrônicos");
        produtos.forEach(p -> System.out.println("\n(2) " + p));
    }

    private void rodaExercicio3() {
        // 3. Retorne produtos com preço maior que o valor fornecido.

        var produtos = produtoRepositorio.findByPrecoGreaterThanEqual(650.00);
        produtos.forEach(p -> System.out.println("\n(3) " + p));
    }

    private void rodaExercicio4() {
        // 4. Retorne produtos com preço menor que o valor fornecido.

        var produtos = produtoRepositorio.findByPrecoLessThanEqual(600.00);
        produtos.forEach(p -> System.out.println("\n(4) " + p));
    }

    private void rodaExercicio5() {
        // 5. Retorne produtos cujo nome contenha o termo especificado.

        var produtos = produtoRepositorio.findByNomeContaining("Sof");
        produtos.forEach(p -> System.out.println("\n(5) " + p));
    }

    private void rodaExercicio6() {
        // 6. Retorne pedidos que ainda não possuem uma data de entrega.

        var pedidos = pedidoRepositorio.findByDataIsNull();
        pedidos.forEach(p -> System.out.println("\n(6) " + p));
    }

    private void rodaExercicio7() {
        // 7. Retorne pedidos com data de entrega preenchida.

        var pedidos = pedidoRepositorio.findByDataIsNotNull();
        pedidos.forEach(p -> System.out.println("\n(7) " + p));
    }

    private void rodaExercicio8() {
        // 8. Retorne produtos de uma categoria ordenados pelo preço de forma crescente.

        var produtos = produtoRepositorio.findByCategoriaNomeOrderByPrecoAsc("Eletrônicos");
        produtos.forEach(p -> System.out.println("\n(8) " + p));
    }

    private void rodaExercicio9() {
        // 9. Retorne produtos de uma categoria ordenados pelo preço de forma decrecente.

        var produtos = produtoRepositorio.findByCategoriaNomeOrderByPrecoDesc("Eletrônicos");
        produtos.forEach(p -> System.out.println("\n(9) " + p));
    }

    private void rodaExercicio10() {
        // 10. Retorne a contagem de produtos em uma categoria específica

        var produtos = produtoRepositorio.countByCategoriaNome("\nEletrônicos");
        System.out.println("(10) " + produtos);
    }

    private void rodaExercicio11() {
        // 11. Retorne a contagem de produtos cujo preço seja maior que o valor fornecido.

        var produtos = produtoRepositorio.countByPrecoGreaterThan(500.00);
        System.out.println("\n(11) " + produtos);
    }

    private void rodaExercicio12() {
        // 12. Retorne produtos com preço menor que o valor fornecido ou cujo nome contenha o termo especificado.

        var produtos = produtoRepositorio.findByPrecoLessThanAndNomeContaining(1000.00, "Sof");
        produtos.forEach(p -> System.out.println("\n(12) " + p));
    }

    private void rodaExercicio13() {
        // 13. Retorne pedidos feitos após uma data específica.

        var pedidos = pedidoRepositorio.findByDataAfter(LocalDate.of(2025, 03, 10));
        pedidos.forEach(p -> System.out.println("\n(13) " + p));
    }

    private void rodaExercicio14() {
        // 14. Retorne pedidos feitos antes de uma data específica.

        var pedidos = pedidoRepositorio.findByDataBefore(LocalDate.of(2025, 02, 01));
        pedidos.forEach(p -> System.out.println("\n(14) " + p));
    }

    private void rodaExercicio15() {
        // 15. Retorne pedidos feitos em um intervalo de datas.

        var pedidos = pedidoRepositorio.findByDataBetween(LocalDate.of(2024, 12, 31), LocalDate.now());
        pedidos.forEach(p -> System.out.println("\n(15) " + p));
    }

    private void rodaExercicio16() {
        // 16. Retorne os três produtos mais caros.

        var produtos = produtoRepositorio.findFirst3ByOrderByPrecoDesc();
        produtos.forEach(p -> System.out.println("\n(16) " + p));
    }

    private void rodaExercicio17() {
        // 17. Retorne o produto mais barato de uma categoria

        var produtos = produtoRepositorio.findTop1ByCategoriaNomeOrderByPrecoAsc("Móveis");
        produtos.forEach(p -> System.out.println("\n(17) " + p));
    }
}
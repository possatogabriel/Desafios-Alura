package br.com.alura.cursos.gerenciador_pedidos.main;

import br.com.alura.cursos.gerenciador_pedidos.model.Categoria;
import br.com.alura.cursos.gerenciador_pedidos.model.Fornecedor_4;
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
        rodaExercicio3e6();
    }

    private void rodaExercicio3e6() {
        // 3. Na sua classe Principal, você pode criar várias categorias e produtos diferentes e fazer as associações correspondentes.

        Categoria eletronicos = new Categoria("Eletrônicos");
        Categoria moveis = new Categoria("Móveis");
        categoriaRepositorio.saveAll(List.of(eletronicos, moveis));

        Fornecedor_4 fornecedorEletronicos = new Fornecedor_4("Tech Fornece");
        Fornecedor_4 fornecedorMoveis = new Fornecedor_4("Seus Móveis");
        fornecedorRepositorio.saveAll(List.of(fornecedorEletronicos, fornecedorMoveis));

        Produto produto1 = new Produto("Computador", 1599.99, eletronicos, fornecedorEletronicos);
        Produto produto2 = new Produto("Televisão", 699.99, eletronicos, fornecedorEletronicos);
        Produto produto3 = new Produto("Sofá", 599.99, moveis, fornecedorMoveis);

        // 6. Faça as devidas associações entre Fornecedor e Produto na sua classe Principal.
        produto1.setFornecedor(fornecedorEletronicos);
        produto2.setFornecedor(fornecedorEletronicos);
        produto3.setFornecedor(fornecedorMoveis);

        eletronicos.setProdutos(List.of(produto1, produto2));
        moveis.setProdutos(List.of(produto3));

        produtoRepositorio.saveAll(List.of(produto1, produto2, produto3));

        categoriaRepositorio.findAll().forEach(c -> c.getProdutos().forEach(p -> System.out.println("(3) PRODUTO: " + p.getNome() + " - CATEGORIA: " + c.getNome())));

        System.out.println();

        produtoRepositorio.findAll().forEach(p -> System.out.println("(6) PRODUTO: " + p.getNome() + " - FORNECEDOR: " + p.getFornecedor().getNome()));
    }
}

package br.com.alura.cursos.gerenciador_pedidos.main;

import br.com.alura.cursos.gerenciador_pedidos.model.Categoria_4;
import br.com.alura.cursos.gerenciador_pedidos.model.Pedido_5;
import br.com.alura.cursos.gerenciador_pedidos.model.Produto_1;
import br.com.alura.cursos.gerenciador_pedidos.repository.CategoriaRepository_7;
import br.com.alura.cursos.gerenciador_pedidos.repository.PedidoRepository_7;
import br.com.alura.cursos.gerenciador_pedidos.repository.ProdutoRepository_7;

import java.time.LocalDate;

public class Main {
    private CategoriaRepository_7 categoriaRepositorio;
    private PedidoRepository_7 pedidoRepositorio;
    private ProdutoRepository_7 produtoRepositorio;

    public Main(CategoriaRepository_7 categoriaRepositorio, PedidoRepository_7 pedidoRepositorio, ProdutoRepository_7 produtoRepositorio) {
        this.categoriaRepositorio = categoriaRepositorio;
        this.pedidoRepositorio = pedidoRepositorio;
        this.produtoRepositorio = produtoRepositorio;
    }

    private void deletaDadosDoBanco() {
        pedidoRepositorio.deleteAll();
        categoriaRepositorio.deleteAll();
        produtoRepositorio.deleteAll();
    }

    public void rodaAplicacao() {
        deletaDadosDoBanco();

        rodaExercicio6();

        rodaExercicio8();
    }

    private void rodaExercicio6() {
        // 6. Execute a aplicação e veja se todas as tabelas foram criadas corretamente. Quando estiver tudo certo, podemos ir para o próximo passo.

        System.out.println("(6) TABELAS CRIADAS COM SUCESSO!");
    }

    private void rodaExercicio8() {
        // 8. Para finalizar, crie um objeto de cada classe e use os repositórios para salvar os dados. Tudo certo para executar os dados? Provavelmente faltará um passo bem importante. Tente se lembrar do que acontece na aula e fazer este último passo. Você também pode analisar o log de erro :) Caso ainda precise de ajuda, na “Opinião do instrutor” terá uma dica para te ajudar.

        Produto_1 produto = new Produto_1("Jogo", 79.99);
        produtoRepositorio.save(produto);

        Categoria_4 categoria = new Categoria_4("Eletrônicos");
        categoriaRepositorio.save(categoria);

        Pedido_5 pedido1 = new Pedido_5(LocalDate.now());
        pedidoRepositorio.save(pedido1);

        // Extra (pra quem quer mergulhar mesmo): uma vez que seu programa tiver executado corretamente, você pode testar os vários tipos de GenerationType do id. Adicione vários registros diferentes, comparando como o id é inserido no banco de dados. Na prática, qual a diferença de cada um dos tipos de geração de id?

        Pedido_5 pedido2 = new Pedido_5(LocalDate.of(2025, 03, 03));
        pedidoRepositorio.save(pedido2);

        Pedido_5 pedido3 = new Pedido_5(LocalDate.of(1995, 04, 03));
        pedidoRepositorio.save(pedido3);

        Pedido_5 pedido4 = new Pedido_5(LocalDate.of(2007, 11, 12));
        pedidoRepositorio.save(pedido4);
    }
}

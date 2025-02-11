package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1.
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        var produto1 = new Produto("Detergente", 15, 2);
        listaDeProdutos.add(produto1);

        var produto2 = new Produto("Fósforo", 5, 5);
        listaDeProdutos.add(produto2);

        var produto3 = new Produto("Carro", 1000, 10);
        listaDeProdutos.add(produto3);

        System.out.println("(1) TAMANHO DA LISTA: " + listaDeProdutos.size());
        System.out.println("(1) ELEMENTO NO ÍNDICE 2 (último): " + listaDeProdutos.get(2));

        // 4.
        var produtoPerecivel1 = new ProdutoPerecivel("Leite", 25, 1, "12/11/2025");
        System.out.println("(4) " + produtoPerecivel1);
    }
}

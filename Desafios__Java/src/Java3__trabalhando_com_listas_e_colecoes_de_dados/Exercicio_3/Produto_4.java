package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_3;

public class Produto_4 {
    // 4. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
    private String nome;
    protected double preco;

    public Produto_4(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

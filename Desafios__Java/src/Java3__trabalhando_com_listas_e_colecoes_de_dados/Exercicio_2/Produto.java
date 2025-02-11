package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_2;

public class Produto {
    // 1. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
    protected String nome;
    protected double preco;
    protected int quantidade;

    // 2. Implemente o 'method toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o 'method' System.out.println().
    @Override
    public String toString() {
        return "Nome: " + nome + " - (R$ " + preco + " - QTD: " + quantidade + ") ";
    }

    // 3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

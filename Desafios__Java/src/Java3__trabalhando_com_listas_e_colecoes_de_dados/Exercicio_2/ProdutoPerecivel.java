package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_2;

public class ProdutoPerecivel extends Produto {
    // 4. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - (R$ " + preco + " - QTD: " + quantidade + " - Data de validade: " + dataValidade + ")";
    }
}

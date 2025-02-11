package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_2;

public class Produto_3 {
    // 3. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um 'method' aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicaDesconto(double porcentagemDeDesconto) {
        return this.preco - (this.preco * (porcentagemDeDesconto / 100));
    }
}

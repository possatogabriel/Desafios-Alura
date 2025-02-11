package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_1;

public class Pessoa {
    // 1. Crie uma classe Pessoa com atributos como nome, idade, e um 'method' toString que represente esses atributos.
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Idade: " + idade;
    }
}

package br.com.alura.cursos.Exercicio_3.model;

public class Pessoa_6 {
    String nome;
    int idade;

    public Pessoa_6(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return """
                %s - %d""".formatted(getNome(), getIdade());
    }
}

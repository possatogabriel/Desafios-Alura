package br.com.alura.cursos.Exercicio_4.model;

public class Produto_6ao9 {
    private String nome;
    private double preco;
    private String categoria;

    public Produto_6ao9(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return """
                %s - PREÇO: R$ %.1f (%s)""".formatted(getNome(), getPreco(), getCategoria());
    }
}

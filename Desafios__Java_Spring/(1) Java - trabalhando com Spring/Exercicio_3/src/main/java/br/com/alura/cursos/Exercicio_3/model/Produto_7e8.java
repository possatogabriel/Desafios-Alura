package br.com.alura.cursos.Exercicio_3.model;

public class Produto_7e8 {
    private String nome;
    private double preco;
    private String categoria;

    public Produto_7e8(String nome, double preco, String categoria) {
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

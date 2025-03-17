package br.com.alura.cursos.contador.model;

public class Avaliacao_6<T> {
    // 6. Vamos criar objetos genéricos. Crie uma classe genérica de Avaliação, de modo que possamos ter, por exemplo: Avaliacao<Servico>, Avaliacao<Produto> e Avaliacao<Assinatura>. Essa classe deve ter o item genérico de avaliação, a nota e um comentário sobre a nota. Tendo criado a classe genérica, você também pode criar um 'method' para calcular as médias das notas recebidas, independente do tipo de item avaliado.

    private T produto;
    private double nota;

    private Integer i = 0;

    public T getProduto() {
        return produto;
    }

    public void setProduto(T produto) {
        this.produto = produto;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        i++;

        this.nota = nota;
    }

    public void calculaMedia() {
        var media = (nota += nota) / i;
        System.out.println("(6) MÉDIA: " + media);
    }
}

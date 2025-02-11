package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_4;

public class ProdutoFisico_5 implements Calculavel_5 {
    @Override
    public void calculaPrecoFinal(double preco) {
        var frete = 11.99;

        var precoFinal = preco + frete;
        System.out.println("(5) PREÇO FINAL: " + precoFinal);
    }
}

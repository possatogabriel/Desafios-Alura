package Java1__criando_a_sua_primeira_aplicacao.Exercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        System.out.println("(1) Escreva uma nota: ");
        var nota1 = input.nextInt();

        System.out.println("(1) Escreva outra nota: ");
        var nota2 = input.nextInt();

        var media = (nota1 + nota2) / 2;

        System.out.println("(1) MÉDIA DAS NOTAS: " + media);

        // 2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double numeroDouble = 4.13;
        int numeroInt = (int) numeroDouble;

        System.out.println("(2) NÚMERO DOUBLE TRANSFORMADO EM INT: " + numeroInt);

        // 3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'a';
        String frase = "(3) A minh" + letra + " c" + letra + "s" + letra + " está suj" + letra + ".";

        System.out.println(frase);

        // 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 413.00;
        int quantidade = 1211;

        double valorFinal = precoProduto * quantidade;
        System.out.println("(4) VALOR FINAL: " + valorFinal);

        // 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 800.85;
        double valorEmReais = valorEmDolares * 4.94;

        System.out.println("(5) VALOR EM REAIS: " + valorEmReais);

        // 6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 999.99;
        double percentualDesconto = 15;

        double desconto = precoOriginal * (percentualDesconto / 100);

        double precoFinal = precoOriginal - desconto;
        System.out.println("(6) PREÇO FINAL: " + precoFinal);
    }
}

package Java1__criando_a_sua_primeira_aplicacao.Exercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        System.out.println("(1 e 2) Escreva um número: ");
        var numero1 = input.nextInt();

        if (numero1 > 0) {
            System.out.println("(1) NÚMERO POSITIVO!");
        } else if (numero1 < 0) {
            System.out.println("(1) NÚMERO NEGATIVO!");
        } else {
            System.out.println("(1) ZERO!");
        }

        // 2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.println("(2) Insira outro número: ");
        var numero2 = input.nextInt();

        if (numero1 == numero2) {
            System.out.println("(2) OS NÚMEROS SÃO IGUAIS!");
        } else {
            if (numero1 > numero2) {
                System.out.println("(2) OS NÚMEROS SÃO DIFERENTES E O NÚMERO 1 É MAIOR!");
            } else {
                System.out.println("(2) OS NÚMEROS SÃO DIFERENTES E O NÚMERO 2 É MAIOR!");
            }
        }

        // 3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("""
                - EXERCÍCIO 3 -
                1. Calcular área do quadrado
                2. Calcular área do círculo
                
                Escolha uma opção: """);

        var opcao = input.nextInt();

        if (opcao == 1) {
            System.out.println("(3) Escreva a altura/largura do quadrado: ");
            var lado = input.nextDouble();

            var areaQuadrado = lado * lado;
            System.out.println("(3) ÁREA DO QUADRADO: " + areaQuadrado);
        } else {
            System.out.println("(3) Escreva o raio: ");
            var raio = input.nextDouble();

            var areaCirculo = 3.14 * (raio * raio);
            System.out.println("(3) ÁREA DO CÍRCULO: " + areaCirculo);
        }

        // 4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("(4) Escreva um número: ");
        var tabuada = input.nextInt();

        for (var i = 0; i < 10; i++) {
            var valor = tabuada * i;

            System.out.println("(4) " + tabuada + " x " + i + " = " + valor);
        }

        // 5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        System.out.println("(5) Escreva um outro número: ");
        var parImpar = input.nextInt();

        if (parImpar % 2 == 0) {
            System.out.println("(5) PAR!");
        } else {
            System.out.println("(5) ÍMPAR");
        }

        // 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.println("(6) Escreva um número para calcular a fatorial: ");
        var numero = input.nextInt();

        for (var i = numero - 1; i > 0; i--) {
            numero = numero * i;
        }

        System.out.println("(6) FATORIAL: " + numero);
    }
}

package br.com.alura.cursos.Exercicio_2.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface IMultiplicacao_1 {
    Integer multiplica(int a, int b);
}

@FunctionalInterface
interface INumeroPrimo_2 {
    boolean verificaPrimo(int n);
}

@FunctionalInterface
interface IConversaoString_3 {
    String converteParaMaiusculo(String s);
}

@FunctionalInterface
interface IPalindromo_4 {
    boolean verificaPalindromo(String str);
}

@FunctionalInterface
interface IDivisao_7 {
    Integer divideNumeros(int a, int b);
}

public class Main {
    public void rodaAplicacao() {
        rodaExercicio1();

        rodaExercicio2();

        rodaExercicio3();

        rodaExercicio4();

        rodaExericio5();

        rodaExercicio6();

        rodaExericicio7();
    }

    private void rodaExercicio1() {
        // 1. Crie uma expressão lambda que multiplique dois números inteiros. A expressão deve ser implementada dentro de uma interface funcional com o 'method' multiplicacao(int a, int b).

        IMultiplicacao_1 multiplicacao = (a, b) -> a * b;

        System.out.println("(1) RESULTADO: " + multiplicacao.multiplica(10, 2));
    }

    private void rodaExercicio2() {
        // 2. Implemente uma expressão lambda que verifique se um número é primo.

        INumeroPrimo_2 numeroPrimo = n -> {
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println("(2) NÚMERO 11 É PRIMO? " + numeroPrimo.verificaPrimo(11));
        System.out.println("(2) NÚMERO 12 É PRIMO? " + numeroPrimo.verificaPrimo(12));
    }

    private void rodaExercicio3() {
        // 3. Crie uma função lambda que receba uma string e a converta para letras maiúsculas.

        IConversaoString_3 conversor = s -> s.toUpperCase();

        System.out.println("(3) STRING CONVERTIDA PARA LETRA MAIÚSCULA: " + conversor.converteParaMaiusculo("esta é minha frase"));
    }

    private void rodaExercicio4() {
        // 4. Crie uma expressão lambda que verifique se uma string é um palíndromo. A expressão deve ser implementada dentro de uma interface funcional com o 'method' boolean verificarPalindromo(String str). Dica: utilize o 'method' reverse da classe StringBuilder.

        IPalindromo_4 palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("(4) A PALAVRA OVO É UM PALÍNDROMO? " + palindromo.verificaPalindromo("ovo"));
        System.out.println("(4) A PALAVRA MEDO É UM PALÍNDROMO? " + palindromo.verificaPalindromo("medo"));
    }

    private void rodaExericio5() {
        // 5. Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova lista onde cada número foi multiplicado por 3. Dica: a função replaceAll, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

        List<Integer> numeros = Arrays.asList(1, 5, 3, 4, 2);
        numeros.replaceAll(n -> n * 3);
        System.out.println("(5) NÚMEROS MULTIPLICADOS POR 3: " + numeros);
    }

    private void rodaExercicio6() {
        // 6. Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética. Dica: a função sort, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

        List<String> strings = Arrays.asList("Billie", "Eilish", "Ilomilo", "BLUE");
        strings.sort(String::compareTo);
        System.out.println("(6) STRINGS ORDENADAS POR ORDEM ALFABÉTICA: " + strings);
    }

    private void rodaExericicio7() {
        // 7. Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo. A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.

        IDivisao_7 divisao = (a, b) -> a / b;

        try {
            var resultado = divisao.divideNumeros(10, 2);
            System.out.println("(7) RESULTADO DA DIVISÃO DOS NÚMEROS: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERRO: " + e);
        }
    }
}

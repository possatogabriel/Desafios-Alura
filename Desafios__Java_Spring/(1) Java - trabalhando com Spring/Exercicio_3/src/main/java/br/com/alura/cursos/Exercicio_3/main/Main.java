package br.com.alura.cursos.Exercicio_3.main;

import br.com.alura.cursos.Exercicio_3.model.Pessoa_6;
import br.com.alura.cursos.Exercicio_3.model.Produto_7e8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public void rodaAplicacao() {
        rodaExercicio1();

        rodaExercicio2();

        rodaExercicio3();

        rodaExercicio4();

        rodaExercicio5();

        rodaExercicio6();

        rodaExercicio7e8();
    }

    private void rodaExercicio1() {
        // 1. Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        var resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("(1) NÚMEROS PARES: " + resultado);
    }

    private void rodaExercicio2() {
        // 2. Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.

        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        var resultado = palavras.stream()
                .map(p -> p.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("(2) PALAVRAS EM MAIÚSCULO: " + resultado);
    }

    private void rodaExercicio3() {
        // 3. Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um por 2 e colete os resultados em uma nova lista.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        var resultado = numeros.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("(3) NÚMEROS ÍMPARES MULTIPLICADOS POR 2: " + resultado);
    }

    private void rodaExercicio4() {
        // 4. Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez) e imprima o resultado.

        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        var resultado = palavras.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("(4) PALAVRAS SEM SE REPETIR: " + resultado);
    }

    private void rodaExercicio5() {
        // 5. Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em uma única lista e os ordene em ordem crescente.

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        var resultado = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(Main::verificaPrimo)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("(5) NÚMEROS PRIMOS DA LISTA: " + resultado);
    }

    private static boolean verificaPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void rodaExercicio6() {
        // 6. Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos, extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.

        List<Pessoa_6> pessoas = Arrays.asList(
                new Pessoa_6("Charlie", 22),
                new Pessoa_6("Bob", 17),
                new Pessoa_6("Alice", 19)
        );

        var resultado = pessoas.stream()
                .filter(p -> p.getIdade() >= 18)
                .sorted(Comparator.comparing(Pessoa_6::getNome))
                .collect(Collectors.toList());

        System.out.println("(6) PESSOAS MAIORES DE 18 EM ORDEM ALFABÉTICA: " + resultado);
    }

    private void rodaExercicio7e8() {
        // 7. Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String), preco (double) e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

        List<Produto_7e8> produtos = Arrays.asList(
                new Produto_7e8("Smartphone", 800.0, "Eletrônicos"),
                new Produto_7e8("Notebook", 1500.0, "Eletrônicos"),
                new Produto_7e8("Teclado", 200.0, "Eletrônicos"),
                new Produto_7e8("Cadeira", 300.0, "Móveis"),
                new Produto_7e8("Monitor", 900.0, "Eletrônicos"),
                new Produto_7e8("Mesa", 700.0, "Móveis")
        );

        var resultado = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .filter(p -> p.getPreco() < 1000)
                .sorted(Comparator.comparing(Produto_7e8::getPreco))
                .collect(Collectors.toList());

        System.out.println("(7) PRODUTOS FILTRADOS POR PREÇO E CATEGORIA: " + resultado);

        // 8. Tomando o mesmo código do exercício anterior como base, modifique o código para que a saída mostre apenas os três produtos mais baratos.

        var resultado2 = produtos.stream()
                .sorted(Comparator.comparing(Produto_7e8::getPreco))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("(8) PRODUTOS MAIS BARATOS: " + resultado2);
    }
}

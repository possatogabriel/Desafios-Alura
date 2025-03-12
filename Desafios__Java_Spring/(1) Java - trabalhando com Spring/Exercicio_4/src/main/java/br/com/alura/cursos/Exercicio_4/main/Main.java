package br.com.alura.cursos.Exercicio_4.main;

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
    }

    private void rodaExercicio1() {
        // 1. Dada a lista de números inteiros a seguir, encontre o maior número dela.

        List<Integer> numeros = Arrays.asList(10, 20, 300, 40, 50);
        var resultado = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("(1) MAIOR NÚMERO DA LISTA: " + resultado);
    }

    private void rodaExercicio2() {
        // 2. Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho. No código a seguir, há um exemplo prático do resultado esperado.

        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        var resultado = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("(2) PALAVRAS SEPARADAS POR TAMANHO: " + resultado);
    }

    private void rodaExercicio3() {
        // 3. Dada a lista de nomes abaixo, concatene-os separados por vírgula. No código a seguir, há um exemplo prático do resultado esperado.

        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        var resultado = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println("(3) NOMES SEPARADOS POR VÍRGULA: " + resultado);
    }

    private void rodaExercicio4() {
        // 4. Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        var resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("(4) SOMA DOS QUADRADOS DE CADA NÚMERO PAR: " + resultado);
    }

    private void rodaExercicio5() {
        // 5. Dada uma lista de números inteiros, separe os números pares dos ímpares.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        var resultado = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("(5) NÚMEROS PARES: " + resultado.get(true));
        System.out.println("(5) NÚMEROS ÍMPARES: " + resultado.get(false));

//        var pares = numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//
//        var impares = numeros.stream()
//                .filter(n -> n % 2 == 1)
//                .collect(Collectors.toList());
//
//        System.out.println("(5) NÚMEROS PARES: " + pares);
//        System.out.println("(5) NÚMEROS ÍMPARES: " + impares);
    }
}

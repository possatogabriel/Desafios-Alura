package br.com.alura.cursos.contador.main;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    Tarefa classeTarefa = new Tarefa();

    public void rodaAplicacao() {
        rodaExercicio1();

        classeTarefa.rodaExercicio4();

        classeTarefa.rodaExercicio5();
    }

    private void rodaExercicio1() {
        // 1. Crie um novo projeto com Spring Boot, usando o site start.spring.io. Esse projeto será o contador, e funcionará na linha de comando. Você deve pedir para um usuário digitar um número e depois imprimir na tela uma contagem de 1 até o número digitado pelo usuário.
        System.out.print("(1) - Digite um número: ");
        var numero = input.nextInt();

        for (var i = 1; i <= numero; i++) {
            System.out.println("(1) - " + i);
        }

        // VER 'pom.xml' PARA EXERCÍCIO 2
    }
}

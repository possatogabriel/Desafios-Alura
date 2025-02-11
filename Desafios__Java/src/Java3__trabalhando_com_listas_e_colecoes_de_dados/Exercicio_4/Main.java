package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(100);
        listaNumeros.add(220);
        listaNumeros.add(150);
        listaNumeros.add(4201);
        listaNumeros.add(50);
        listaNumeros.add(8900);
        listaNumeros.add(7);

        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);

        // 3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o 'method' Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
        ArrayList<Titulo> listaTitulos = new ArrayList<>();

        var titulo1 = new Titulo("Ainda Estou Aqui");
        listaTitulos.add(titulo1);

        var titulo2 = new Titulo("Enigma do Medo");
        listaTitulos.add(titulo2);

        var titulo3 = new Titulo("Dune - Part II");
        listaTitulos.add(titulo3);

        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

        // 4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
        // List<String> arrayList = new ArrayList<>();
        // List<String> linkedList = new LinkedList<>();

        // 5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
        List<String> arrayELinkedList;

        arrayELinkedList = new ArrayList<>();
        arrayELinkedList.add("1");
        arrayELinkedList.add("2");
        System.out.println(arrayELinkedList);

        arrayELinkedList = new LinkedList<>();
        arrayELinkedList.add("3");
        arrayELinkedList.add("4");
        System.out.println(arrayELinkedList);
    }
}

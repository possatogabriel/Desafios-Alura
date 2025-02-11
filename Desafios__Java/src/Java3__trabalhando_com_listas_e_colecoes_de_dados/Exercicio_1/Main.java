package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 2. No 'method' main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // 3. Adicione pelo menos três pessoas à lista utilizando o 'method' add.
        var pessoa1 = new Pessoa("Gabriel", 17);
        listaDePessoas.add(pessoa1);

        var pessoa2 = new Pessoa("Mia", 24);
        listaDePessoas.add(pessoa2);

        var pessoa3 = new Pessoa("Kian", 4000);
        listaDePessoas.add(pessoa3);

        // 4. Imprima o tamanho da lista utilizando o 'method' size.
        System.out.println("(4) TAMANHO DA LISTA: " + listaDePessoas.size());

        // 5. Imprima a primeira pessoa da lista utilizando o 'method' get.
        System.out.println("(5) PRIMEIRA PESSOA DA LISTA" + listaDePessoas.getFirst());

        // 6. Imprima a lista completa
        System.out.println("(6) LISTA DE PESSOAS: " + listaDePessoas);
    }
}

package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        lista.add("H");

        lista.forEach(System.out::println);

        // 2. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
        // var cachorro = new Cachorro_2();
        // var animal = (Animal) cachorro;

        // 3. Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
        var animal = new Animal_2();

        if (animal instanceof Cachorro_2) {
            System.out.println("O objeto é um cachorro!");
        } else {
            System.out.println("O objeto não é um cachorro");
        }

        // 4.
        ArrayList<Produto_4> listaProdutos = new ArrayList<>();
        var valor = 0;

        var produto1 = new Produto_4("Detergente", 15);
        listaProdutos.add(produto1);

        var produto2 = new Produto_4("Mouse", 120);
        listaProdutos.add(produto2);

        var produto3 = new Produto_4("Moedas Virtuais", 60);
        listaProdutos.add(produto3);

        for (Produto_4 produto : listaProdutos) {
            valor += produto.getPreco() / listaProdutos.size();
        }

        System.out.println("VALOR MÉDIO DOS PRODUTOS: " + valor);

        // 5.
        ArrayList<Forma_5> listaFormas = new ArrayList<>();

        var quadrado1 = new Quadrado_5(10);
        listaFormas.add(quadrado1);

        var quadrado2 = new Quadrado_5(20);
        listaFormas.add(quadrado2);

        var circulo1 = new Circulo_5(5);
        listaFormas.add(circulo1);

        var circulo2 = new Circulo_5(10);
        listaFormas.add(circulo2);

        for (Forma_5 elemento : listaFormas) {
            elemento.calcularArea();
        }

        // 6.
        ArrayList<ContaBancaria_6> listaContas = new ArrayList<>();

        var conta1 = new ContaBancaria_6(1100, 200);
        listaContas.add(conta1);

        var conta2 = new ContaBancaria_6(202, 2200);
        listaContas.add(conta2);

        var conta3 = new ContaBancaria_6(32, 402);
        listaContas.add(conta3);

        var conta4 = new ContaBancaria_6(5, 12);
        listaContas.add(conta4);

        var contaComMaiorSaldo = listaContas.getFirst();

        for (ContaBancaria_6 conta : listaContas) {
            if (conta.getSaldo() > contaComMaiorSaldo.getSaldo()) {
                contaComMaiorSaldo = conta;

                System.out.println("CONTA COM O MAIOR SALDO: " + conta);
            }
        }
    }
}

package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_3;

public class Main {
    public static void main(String[] args) {
        // 1.
        var carro = new Carro_1();

        carro.defineModelo("Ford");
        carro.definePrecos(1110, 950, 1500);

        var informacoesCarro = carro.exibeInformacoes();
        System.out.println("(1) " + informacoesCarro);

        // 2.
        var cachorro = new Cachorro_2();
        cachorro.emiteSom();
        cachorro.abanaRabo();

        var gato = new Gato_2();
        gato.emiteSom();
        gato.arranhaSofa();

        // 3.
        var contaNormal = new ContaBancaria_3();

        contaNormal.setSaldo(413.12);
        contaNormal.exibeSaldo();

        contaNormal.deposita(6.88);
        contaNormal.exibeSaldo();

        contaNormal.saca(400);
        contaNormal.exibeSaldo();

        var contaCorrente = new ContaCorrente_3();

        contaCorrente.setSaldo(1980.29);
        contaCorrente.deposita(19.71);
        contaCorrente.saca(80);
        contaCorrente.exibeSaldo();

        contaCorrente.cobraTarifa(10);
        contaCorrente.exibeSaldo();
    }
}

package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_3;

public class ContaCorrente_3 extends ContaBancaria_3 {
    public void cobraTarifa(double valor) {
        if (valor > saldo) {
            System.out.println("A tarifa mensal é MAIOR do que o saldo!");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public void exibeSaldo() {
        System.out.println("""
            - - - - - - - - - - - -
            (3) - CONTA CORRENTE - 
            Saldo atual: %.2f
            - - - - - - - - - - - -
            """.formatted(saldo));

    }
}

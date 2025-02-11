package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_3;

public class ContaBancaria_3 {
    // 3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um 'method' específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double saque) {
        if (saque > this.saldo) {
            System.out.println("O valor do saque é MAIOR do que o saldo atual!");
        } else {
            this.saldo -= saque;
        }
    }

    public void exibeSaldo() {
        System.out.println("""
            - - - - - - - - - - - -
            (3) - CONTA BANCÁRIA - 
            Saldo atual: %.2f
            - - - - - - - - - - - -
            """.formatted(saldo));

    }
}

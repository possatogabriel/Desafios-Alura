package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_3;

public class ContaBancaria_6 {
    // 6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
    private int numeroConta;
    private double saldo;

    public ContaBancaria_6(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroConta + " - Saldo: " + saldo;
    }
}

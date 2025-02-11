package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_4;

public class ConversorMoeda_1 implements ConversaoFinanceira_1 {
    private double valor;


    @Override
    public double converteDolarParaReal(double valorEmDolar) {
        return valorEmDolar * 5;
    }
}

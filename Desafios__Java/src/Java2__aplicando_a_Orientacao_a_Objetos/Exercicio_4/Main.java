package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_4;

public class Main {
    public static void main(String[] args) {
        // 1.
        var conversor = new ConversorMoeda_1();

        var valorEmReais = conversor.converteDolarParaReal(500);
        System.out.println("(1) VALOR EM REAIS: " + valorEmReais);

        // 2.
        var calculadoraSala = new CalculadoraSalaRetangular_2();

        var area = calculadoraSala.calcularArea(10, 5);
        System.out.println("(2) ÁREA DO RETÂNGULO: " + area);

        var perimetro = calculadoraSala.calcularPerimetro(10, 5);
        System.out.println("(2) ÁREA DO PERÍMETRO: " + perimetro);

        // 3.
        var tabuada = new TabuadaMultiplicacao_3();
        tabuada.mostraTabuada(10);

        // 4.
        var temperatura = new ConversorTemperaturaPadrao_4();
        temperatura.celsiusParaFahrenheit(25);
        temperatura.FahrenheitParaCelsius(77);

        // 5 e 6.
        var produtoFisico = new ProdutoFisico_5();
        produtoFisico.calculaPrecoFinal(400);

        var produtoDigital = new Livro_5();
        produtoDigital.calculaPrecoFinal(400);
    }
}

package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_4;

public class ConversorTemperaturaPadrao_4 implements ConversorTemperatura_4 {
    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        var celsius = (temperatura * 9 / 5) + 32;

        System.out.println("(4) TEMPERATURA EM CELSIUS: " + celsius);
    }

    @Override
    public void FahrenheitParaCelsius(double temperatura) {
        var fahrenheit = (temperatura - 32) * 5 / 9;
        System.out.println("(4) TEMPERATURA EM FAHRENHEIT: " + fahrenheit);
    }
}

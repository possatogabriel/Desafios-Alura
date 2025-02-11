package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_4;

public class CalculadoraSalaRetangular_2 implements CalculoGeometrico_2 {
    @Override
    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return (altura * 2) + (largura * 2);
    }
}

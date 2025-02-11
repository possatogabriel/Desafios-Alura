package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_3;

public class Circulo_5 implements Forma_5 {
    private int raio;

    public Circulo_5(int raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        var area = 3.14 * (raio * raio);

        System.out.println("ÁREA DO CÍRCULO: " + area);
    }
}

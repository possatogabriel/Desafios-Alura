package Java3__trabalhando_com_listas_e_colecoes_de_dados.Exercicio_3;

public class Quadrado_5 implements Forma_5 {
    private int lado;

    public Quadrado_5(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        var area = lado * lado;

        System.out.println("ÁREA DO QUADRADO: " + area);
    }
}

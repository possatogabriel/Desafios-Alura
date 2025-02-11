package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_4;

public class TabuadaMultiplicacao_3 implements Tabuada_3 {
    @Override
    public void mostraTabuada(int numero) {
        for (var i = 0; i <= 10; i++) {
            var resultado = numero * i;

            System.out.println("(3) " + numero + " x " + i + " = " + resultado);
        }
    }
}

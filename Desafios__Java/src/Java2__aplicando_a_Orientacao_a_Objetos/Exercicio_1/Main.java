package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_1;

public class Main {
    public static void main(String[] args) {
        // 1.
        var pessoa = new Pessoa_1();
        pessoa.mensagem();

        // 2.
        var calculadora = new Calculadora_2();
        var resultado = calculadora.retornaDobro(5);
        System.out.println("(2) " + resultado);

        // 3.
        var musica = new Musica_3();
        musica.setTitulo("Abracadra");
        musica.setArtista("Lady Gaga");
        musica.setAnoLancamento(2025);
        musica.setAvaliacao(5.0);
        musica.setNumeroDeAvaliacoes(2);

        var fichaMusica = musica.exibeFicha();
        System.out.println("(3) " + fichaMusica);

        // 4.
        var carro = new Carro_4();
        carro.setModelo("Ford");
        carro.setAno(2020);
        carro.setCor("Azul");

        var fichaCarro = carro.exibeFicha();
        System.out.println("(4) " + fichaCarro);

        // 5.
        var aluno = new Aluno_5();
        aluno.setNome("Gabriel");
        aluno.setIdade(17);

        var fichaAluno = aluno.exibeFicha();
        System.out.println("(5) " + fichaAluno);
    }
}

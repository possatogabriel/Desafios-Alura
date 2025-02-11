package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_2;

public class Main {
    public static void main(String[] args) {
        // 2.
        var idadePessoa = new IdadePessoa_2();

        idadePessoa.setNome("Gabriel");
        idadePessoa.setIdade(17);

        var maiorDeIdade = idadePessoa.verificaIdade();

        if (maiorDeIdade == true) {
            System.out.println("(2) MAIOR DE IDADE!");
        } else {
            System.out.println("(2) MENOR DE IDADE!");
        }

        // 3.
        var produto = new Produto_3();

        produto.setNome("Camisa - Ordem Paranormal");
        produto.setPreco(69.99);

        var valorComDesconto = produto.aplicaDesconto(10);
        System.out.println("""
                        (3) %.2f""".formatted(valorComDesconto));

        // 4.
        var aluno = new Aluno_4();

        aluno.setNome("Gabriel");
        aluno.setNota1(10);
        aluno.setNota2(9);
        aluno.setNota3(5);

        var media = aluno.calculaMedia();
        System.out.println("(4) " + media);

        // 5.
        var livro = new Livro_5();

        livro.setTitulo("Ainda Estou Aqui");
        livro.setAutor("Marcelo Rubens Paiva");

        var detalhes = livro.exibeDetalhes();
        System.out.println("(5) " + detalhes);
    }
}

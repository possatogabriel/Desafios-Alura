package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_4;

public class Titulo_2 {
    // 2. Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
    private String nome;
    private int anoDeLancamento;
    private String diretor;

    public Titulo_2(String nome, int anoDeLancamento, String diretor) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.diretor = diretor;
    }
}

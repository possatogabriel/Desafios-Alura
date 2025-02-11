package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_4;

public class Veiculo_4 {
    // 4. Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
    private String tipo;
    private String marca;
    private String cor;
    private int anoDeLancamento;

    public Veiculo_4(String tipo, String marca, String cor, int anoDeLancamento) {
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
        this.anoDeLancamento = anoDeLancamento;
    }
}

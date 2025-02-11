package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_1;

public class Musica_3 {
    // 3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numeroDeAvaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }

    public void setNumeroDeAvaliacoes(int numeroDeAvaliacoes) {
        this.numeroDeAvaliacoes = numeroDeAvaliacoes;
    }

    public String exibeFicha() {
        return """
                - FICHA TÉCNICA DA MÚSICA - 
                    
                Título: %s
                Artista: %s
                Ano da lançamento: %d  
                Avaliação média: %.2f / 5,00 
                Número de avaliações: %d    
                                   
                """.formatted(getTitulo(), getArtista(), getAnoLancamento(), getAvaliacao(), getNumeroDeAvaliacoes());
    }
}

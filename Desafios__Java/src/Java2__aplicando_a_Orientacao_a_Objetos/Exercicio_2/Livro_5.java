package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_2;

public class Livro_5 {
    // 5. Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um 'method' exibirDetalhes que imprime o título e o autor do livro.
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String exibeDetalhes() {
        return """
                - DETALHES DO LIVRO - 
                    
                Título: %s
                Autor: %s
                                   
                """.formatted(getTitulo(), getAutor());
    }
}

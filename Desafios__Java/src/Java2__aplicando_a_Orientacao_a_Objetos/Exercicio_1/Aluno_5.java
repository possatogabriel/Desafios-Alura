package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_1;

public class Aluno_5 {
    // 5. Crie uma classe Aluno com atributos nome, idade, e um 'method' para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o 'method' para exibir as informações.
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String exibeFicha() {
        return """
                - FICHA TÉCNICA DO ALUNO - 
                    
                Nome: %s
                Idade: %d  
                                   
                """.formatted(getNome(), getIdade());
    }
}

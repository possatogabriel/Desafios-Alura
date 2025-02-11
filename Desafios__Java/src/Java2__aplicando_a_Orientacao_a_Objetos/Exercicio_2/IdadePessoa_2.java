package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_2;

public class IdadePessoa_2 {
    // 2. Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um 'method' verificarIdade que imprime se a pessoa é maior de idade ou não.
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

    public boolean verificaIdade() {
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

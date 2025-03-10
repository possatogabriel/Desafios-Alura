package br.com.alura.cursos.contador.main;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        // 3. Agora iremos trabalhar com serialização e desserialização. Para isso, você pode reaproveitar seu projeto do exercício 1. Adicione a dependência do Jackson ao seu pom.xml, pois iremos utilizá-la bastante nos próximos exercícios. Também crie uma classe Tarefa. Para que o Jackson funcione corretamente, é importante que sua classe tenha todos os getters e um construtor padrão. Também é legal criar um 'method' toString().

        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    @Override
    public String toString() {
        return """
                - TAREFA - 
                
                > DESCRIÇÃO: %s
                > AUTOR: %s
                
                > CONCLUÍDA: %s""".formatted(getDescricao(), getPessoaResponsavel(), isConcluida());
    }
}

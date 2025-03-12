package br.com.alura.cursos.contador.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Tarefa_3 {
    // 3. Agora iremos trabalhar com serialização e desserialização. Para isso, você pode reaproveitar seu projeto do exercício 1. Adicione a dependência do Jackson ao seu pom.xml, pois iremos utilizá-la bastante nos próximos exercícios. Também crie uma classe Tarefa. Para que o Jackson funcione corretamente, é importante que sua classe tenha todos os getters e um construtor padrão. Também é legal criar um 'method' toString().

    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    private ObjectMapper mapper = new ObjectMapper();

    public Tarefa_3(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public Tarefa_3() {
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
                
                * * * * * * * * * *
                (5) - TAREFA (de JSON pra classe) - 
                
                > DESCRIÇÃO: %s
                > AUTOR: %s
                
                > CONCLUÍDA: %s
                * * * * * * * * * *""".formatted(getDescricao(), getPessoaResponsavel(), isConcluida());
    }

    public void rodaExercicio4() {
        // 4. Lembre-se: serializar um objeto é conseguir representá-lo de alguma forma em um arquivo. Aqui, você deve instanciar um objeto do tipo Tarefa e fazer com que o conteúdo do objeto vá para o arquivo tarefa.json. Para isso, utilize o Jackson para te auxiliar na tarefa. Observação: para criar novos arquivos, podemos utilizar new File("tarefa.json").

        Tarefa_3 tarefa1 = new Tarefa_3("Realizar exercícios opcionais", true, "Gabriel Possato");

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/java/br/com/alura/cursos/contador/json/tarefa1.json"), tarefa1);
            System.out.println("\n(4) DADOS DA TAREFA 1 SALVOS NA PASTA 'json'!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void rodaExercicio5() {
        // 5. Agora, você fará o oposto da atividade anterior: a desserialização de um arquivo, que é ler os valores de um arquivo específico e transformar em um objeto. Leia o conteúdo do arquivo tarefa.json, produzido no exercício anterior, e o transforme em um objeto do tipo Tarefa. Exiba o conteúdo do objeto na tela.

        try {
            var tarefa1 = mapper.readValue(new File("src/main/java/br/com/alura/cursos/contador/json/tarefa1.json"), Tarefa_3.class);
            System.out.println(tarefa1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package br.com.alura.cursos.gerenciador_pedidos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Produtos")
public class Produto_1 {
    // 1. Crie uma classe chamada Produto com os seguintes atributos: id (Long, chave primária) nome (String) preco (Double) Anote a classe com @Entity e mapeie o atributo id como chave primária com @Id. A classe deve ter um construtor e os getters.

    @Id
    // 2. Modifique o exercício anterior para usar a anotação @GeneratedValue no campo id, com a estratégia de geração automática de identificadores (GenerationType.IDENTITY).
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    // 3. Agora, iremos usar vários parâmetros da anotação @Column. Acrescente os seguintes requisitos à classe Produto: O atributo nome deve ser único e não nulo. O atributo preco deve ser armazenado em uma coluna chamada valor.
    @Column(unique = true, nullable = false)
    private String nome;

    @Column(name = "valor")
    private double preco;

    public Produto_1(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto_1() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

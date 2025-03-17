package br.com.alura.cursos.gerenciador_pedidos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Categorias")
public class Categoria_4 {
    // 4. Crie uma classe Categoria com os atributos: id (Long, chave primária) nome (String) A classe deve ter um construtor e os getters. Transforme a classe em entidade.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Categoria_4(String nome) {
        this.nome = nome;
    }

    public Categoria_4() {
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
}

package br.com.alura.cursos.gerenciador_pedidos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // 1. Relacione Categoria e Produto usando @OneToMany, permitindo que uma categoria tenha vários produtos. Assim, estamos definindo um relacionamento 1:n do lado da categoria. Aqui, ao salvarmos uma categoria, queremos salvar seus produtos automaticamente também. Faça a configuração necessária para atender a esse requisito.

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Produto> produtos;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria() {
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}

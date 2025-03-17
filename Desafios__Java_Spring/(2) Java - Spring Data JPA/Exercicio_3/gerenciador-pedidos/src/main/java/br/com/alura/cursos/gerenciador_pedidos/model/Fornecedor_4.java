package br.com.alura.cursos.gerenciador_pedidos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Fornecedores")
public class Fornecedor_4 {
    // 4. Crie uma nova classe Fornecedor, com os atributos id e nome. Transforme a classe em entidade.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Fornecedor_4(String nome) {
        this.nome = nome;
    }

    public Fornecedor_4() {
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

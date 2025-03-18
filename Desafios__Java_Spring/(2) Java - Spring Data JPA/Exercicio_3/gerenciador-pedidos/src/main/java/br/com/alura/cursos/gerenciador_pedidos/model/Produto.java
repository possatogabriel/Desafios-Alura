package br.com.alura.cursos.gerenciador_pedidos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome;

    @Column(name = "valor")
    private double preco;

    // 2. Repare que o relacionamento criado é unidirecional: somente a classe Categoria o enxerga. Podemos deixá-lo bidirecional, configurando um relacionamento do tipo n:1 do lado do Produto, com a anotação @ManyToOne.
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    // 5. Configure um relacionamento unidirecional entre Fornecedor e Produto. O relacionamento deve ser mapeado na classe Produto. Logo, é nessa classe que deverá ter a anotação de relacionamento. Qual é a melhor anotação para usarmos neste caso?
    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor_4 fornecedor;

    @ManyToMany
    List<Pedido> pedidos;

    public Produto(String nome, double preco, Categoria categoria, Fornecedor_4 fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public Produto() {
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor_4 getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor_4 fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}

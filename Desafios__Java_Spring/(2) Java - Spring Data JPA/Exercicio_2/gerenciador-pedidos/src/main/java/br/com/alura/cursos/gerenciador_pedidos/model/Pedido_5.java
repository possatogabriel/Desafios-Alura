package br.com.alura.cursos.gerenciador_pedidos.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pedidos")
public class Pedido_5 {
    // 5. Crie uma classe Pedido com os seguintes atributos: id (Long, chave primária) data (LocalDate) A classe deve ter um construtor e os getters. Transforme a classe em entidade.

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private LocalDate data;

    public Pedido_5(LocalDate data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

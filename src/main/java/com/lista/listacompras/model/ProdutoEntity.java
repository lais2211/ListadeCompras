package com.lista.listacompras.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer","handler", "compra"})
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double valor;

    @ManyToOne
    @JoinColumn(name = "compra_id")
    private ComprasEntity compra;

}

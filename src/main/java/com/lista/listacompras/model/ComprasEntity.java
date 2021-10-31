package com.lista.listacompras.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "compras")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class ComprasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column (name = "data")
    private String data;

    @OneToMany(mappedBy = "compra")
    private List<ProdutoEntity> produtos;

}

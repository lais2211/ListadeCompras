package com.lista.listacompras.produto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDto {

    private Long compraId;
    private String nome;
    private Double valor;

}

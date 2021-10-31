package com.lista.listacompras.controller;

import com.lista.listacompras.model.ProdutoEntity;
import com.lista.listacompras.produto.ProdutoDto;
import com.lista.listacompras.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping(value = "/")
    public List<ProdutoEntity> todosProdutos(){

        return service.todosProdutos();
    }

    @PostMapping(value = "/add")
    public ProdutoEntity adicionar(@RequestBody ProdutoDto produto) {

        return service.adicionarProduto(produto.getNome(),produto.getCompraId(), produto.getValor());

    }

    @PostMapping(value = "/produto")
    public List<ProdutoEntity> acharProduto(String produto){

        return service.acharProduto(produto);
    }

}

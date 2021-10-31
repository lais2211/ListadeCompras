package com.lista.listacompras.service;

import com.lista.listacompras.model.ProdutoEntity;
import com.lista.listacompras.repository.ComprasRepository;
import com.lista.listacompras.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repositoryProduto;

    @Autowired
    private ComprasRepository repositoryCompras;

    public List<ProdutoEntity> todosProdutos(){

        return repositoryProduto.findAll();
    }

    public ProdutoEntity adicionarProduto(String name,Long compraId, Double valor){

        ProdutoEntity produto = new ProdutoEntity();
        produto.setNome(name);
        produto.setValor(valor);
        produto.setCompra(repositoryCompras.findById(compraId).get());

        return repositoryProduto.save(produto);

    }

    public List<ProdutoEntity> acharProduto(String produto){

        return repositoryProduto.findTop6ByNome(produto);

    }

}

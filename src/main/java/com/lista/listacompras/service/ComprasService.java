package com.lista.listacompras.service;

import com.lista.listacompras.date.DataDto;
import com.lista.listacompras.model.ComprasEntity;
import com.lista.listacompras.repository.ComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ComprasService {

    @Autowired
    private ComprasRepository repositoryCompras;

    public List<ComprasEntity> todasCompras(){
        return repositoryCompras.findAll();
    }

    public ComprasEntity adicionarCompras(String nome,String data){

        ComprasEntity compras = new ComprasEntity();
        compras.setNome(nome);
        compras.setData(data);

        return repositoryCompras.save(compras);

    }

    public List<ComprasEntity> acharData(DataDto data){

        return repositoryCompras.findByData(data.getData());
    }

}

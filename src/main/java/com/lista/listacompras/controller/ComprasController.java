package com.lista.listacompras.controller;

import com.lista.listacompras.compras.ComprasDto;
import com.lista.listacompras.date.DataDto;
import com.lista.listacompras.model.ComprasEntity;
import com.lista.listacompras.service.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/compras")
public class ComprasController {

    @Autowired
    ComprasService service;

    @GetMapping(value = "/")
    public List<ComprasEntity> todasCompras(){

        return  service.todasCompras();
    }

    @PostMapping(value = "/data")
    public List<ComprasEntity> acharData(@RequestBody DataDto data){

        return  service.acharData(data);
    }

    @PostMapping(value = "/add")
    public ComprasEntity adicionar(@RequestBody ComprasDto compras){

        return service.adicionarCompras(compras.getNome(), compras.getData());
    }

}

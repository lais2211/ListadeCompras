package com.lista.listacompras.repository;

import com.lista.listacompras.date.DataDto;
import com.lista.listacompras.model.ComprasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComprasRepository extends JpaRepository<ComprasEntity,Long> {

    List<ComprasEntity> findByData(String data);


}

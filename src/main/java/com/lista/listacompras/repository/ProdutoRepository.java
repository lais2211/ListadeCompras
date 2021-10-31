package com.lista.listacompras.repository;

import com.lista.listacompras.model.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity,Long> {

    List<ProdutoEntity> findTop6ByNome(String produto);

}

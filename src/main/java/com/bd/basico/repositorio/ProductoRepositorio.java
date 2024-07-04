package com.bd.basico.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.basico.modelo.TblProducto;

public interface ProductoRepositorio extends CrudRepository<TblProducto,Integer>{

}

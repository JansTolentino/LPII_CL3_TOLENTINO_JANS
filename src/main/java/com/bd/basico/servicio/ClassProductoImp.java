package com.bd.basico.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.basico.modelo.TblProducto;
import com.bd.basico.repositorio.ProductoRepositorio;


@Service
@Transactional
public class ClassProductoImp implements IProductoServicio {
    
    // Inyección de dependencia
    @Autowired
    private ProductoRepositorio iproductorepository;

    @Override
    public List<TblProducto> ListadoProducto() {
        // Devuelve listado
        return (List<TblProducto>) iproductorepository.findAll();
    }

    @Override
    public void RegistrarProducto(TblProducto producto) {
        // Registra los datos de producto
        iproductorepository.save(producto);
    }

    @Override
    public TblProducto BuscarPorId(Integer id) {
        // Busca producto por código, si no encuentra devuelve nulo...
        return iproductorepository.findById(id).orElse(null);
    }

    @Override
    public void Eliminar(Integer id) {
        // Elimina por código
        iproductorepository.deleteById(id);
    }
}

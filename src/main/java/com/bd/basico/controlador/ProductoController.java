package com.bd.basico.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.basico.modelo.TblProducto;
import com.bd.basico.servicio.IProductoServicio;

import org.springframework.ui.Model;
@Controller
@RequestMapping("/vistas")
public class ProductoController {


	@Autowired
	private IProductoServicio iproductoservicio;


	@GetMapping("ListadoProducto")
	public String ListadoProducto(Model modelo) {

	    List<TblProducto> listado = iproductoservicio.ListadoProducto();
	    for (TblProducto lis : listado) {
	        System.out.println("codigo " + lis.getIdproductocl3() + " " + " nombre " + lis.getNombrecl3());
	    }

	    modelo.addAttribute("listado", listado);
	    // Retornamos
	    return "/Vistas/ListadoProducto";
	} 


	@GetMapping("/RegistrarProducto")
	public String RegistrarProducto(Model modelo) {

	    TblProducto producto = new TblProducto();

	    modelo.addAttribute("regproducto", producto);

	    return "/Vistas/RegistrarProducto";
	}


	@PostMapping("/GuardarProducto")
	public String GuardarProducto(@ModelAttribute TblProducto producto, Model modelo) {
	    iproductoservicio.RegistrarProducto(producto);
	    System.out.println("dato registrado en la bd");

	    return "redirect:/vistas/ListadoProducto";
	}


	@GetMapping("/editar/{id}")
	public String Editar(@PathVariable("id") Integer idproductocl3, Model modelo) {
	    TblProducto producto = iproductoservicio.BuscarPorId(idproductocl3);

	    modelo.addAttribute("regproducto", producto);

	    return "/Vistas/RegistrarProducto";
	} 

	//
	@GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer idProducto, Model modelo) {
        iproductoservicio.Eliminar(idProducto);
        System.out.println("dato Eliminado en la bd");
        return "redirect:/vistas/ListadoProducto";
    }
	
} 

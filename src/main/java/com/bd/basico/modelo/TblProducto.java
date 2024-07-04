package com.bd.basico.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_Producto")

public class TblProducto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idProductoCL3;

	private String nombreCL3;
	
	private double precioVentaCL3;
	
	private int stockCL3;
	
	private double precioCompCL3;
	
	private String estadoCL3;
	
	private String descripCL3;
	
	public int getIdProductoCL3() {
		return idProductoCL3;
	}

	public void setIdProductoCL3(int idProductoCL3) {
		this.idProductoCL3 = idProductoCL3;
	}

	public String getNombreCL3() {
		return nombreCL3;
	}

	public void setNombreCL3(String nombreCL3) {
		this.nombreCL3 = nombreCL3;
	}

	public double getPrecioVentaCL3() {
		return precioVentaCL3;
	}

	public void setPrecioVentaCL3(double precioVentaCL3) {
		this.precioVentaCL3 = precioVentaCL3;
	}

	public int getStockCL3() {
		return stockCL3;
	}

	public void setStockCL3(int stockCL3) {
		this.stockCL3 = stockCL3;
	}

	public double getPrecioCompCL3() {
		return precioCompCL3;
	}

	public void setPrecioCompCL3(double precioCompCL3) {
		this.precioCompCL3 = precioCompCL3;
	}

	public String getEstadoCL3() {
		return estadoCL3;
	}

	public void setEstadoCL3(String estadoCL3) {
		this.estadoCL3 = estadoCL3;
	}

	public String getDescripCL3() {
		return descripCL3;
	}

	public void setDescripCL3(String descripCL3) {
		this.descripCL3 = descripCL3;
	}

	@Override
	public String toString() {
		return "TblProducto [idProductoCL3=" + idProductoCL3 + ", nombreCL3=" + nombreCL3 + ", precioVentaCL3="
				+ precioVentaCL3 + ", stockCL3=" + stockCL3 + ", precioCompCL3=" + precioCompCL3 + ", estadoCL3="
				+ estadoCL3 + ", descripCL3=" + descripCL3 + "]";
	}	
	
	
}

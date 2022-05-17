package com.feria.webvirtual.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalleordenes")
public class DetalleOrden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private Integer cantidad;
	private double precio;
	private double total;
	
	@OneToOne
	private OrdenCompra ordenCompra;
	
	@ManyToOne
	private Tbl_proveedor proveedor;
	
	public DetalleOrden() {
		
	}
	
	public DetalleOrden(Integer id, String nombre, Integer cantidad, double precio, double total) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public OrdenCompra getOrden() {
		return ordenCompra;
	}

	public void setOrden(OrdenCompra orden) {
		this.ordenCompra = orden;
	}

	public Tbl_proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Tbl_proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	
}

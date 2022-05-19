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
	private String clave_proveedor;
	private String infoproveedor;
	private String infolibro;
	private String autor;
	private String titulo;
	private int anio;
	private String isbn;
	private String formato;
	
	@ManyToOne
	private OrdenCompra ordenCompra;
	
	@ManyToOne
	private Tbl_proveedor proveedor;
	
	public DetalleOrden() {
		
	}
	
	public DetalleOrden(Integer id, String nombre, Integer cantidad, double precio, double total,
			String clave_proveedor, String infoproveedor, String infolibro, String autor, String titulo, int anio,
			String isbn, String formato, OrdenCompra ordenCompra, Tbl_proveedor proveedor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
		this.clave_proveedor = clave_proveedor;
		this.infoproveedor = infoproveedor;
		this.infolibro = infolibro;
		this.autor = autor;
		this.titulo = titulo;
		this.anio = anio;
		this.isbn = isbn;
		this.formato = formato;
		this.ordenCompra = ordenCompra;
		this.proveedor = proveedor;
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

	public String getClave_proveedor() {
		return clave_proveedor;
	}

	public void setClave_proveedor(String clave_proveedor) {
		this.clave_proveedor = clave_proveedor;
	}

	public String getInfoproveedor() {
		return infoproveedor;
	}

	public void setInfoproveedor(String infoproveedor) {
		this.infoproveedor = infoproveedor;
	}

	public String getInfolibro() {
		return infolibro;
	}

	public void setInfolibro(String infolibro) {
		this.infolibro = infolibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + ", clave_proveedor=" + clave_proveedor + ", infoproveedor=" + infoproveedor
				+ ", infolibro=" + infolibro + ", autor=" + autor + ", titulo=" + titulo + ", anio=" + anio + ", isbn="
				+ isbn + ", formato=" + formato + ", ordenCompra=" + ordenCompra + ", proveedor=" + proveedor + "]";
	}
	
}

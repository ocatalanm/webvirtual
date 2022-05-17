package com.feria.webvirtual.dao.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ordencompra")
public class OrdenCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombresolicitante;
	private String informacionsolicitante;
	private String adscripcion;
	private String clave_proveedor;
	private String infoproveedor;
	private String infolibro;
	private String autor;
	private String titulo;
	private String anio;
	private String isbn;
	private String formato;
	@Temporal(TemporalType.DATE)
	private Date fechacompra;
	private double total;
	private String numero;
	
	@ManyToOne
	private Tbl_usuarios usuario;
	
	@OneToOne(mappedBy = "ordenCompra")
	private DetalleOrden detalleOrden;
	
	public OrdenCompra() {
		
	}

	public OrdenCompra(Integer id, String nombresolicitante, String informacionsolicitante, String adscripcion,
			String clave_proveedor, String infoproveedor, String infolibro, String autor, String titulo, String anio,
			String isbn, String formato, Date fechacompra, double total, String numero, Tbl_usuarios usuario,
			DetalleOrden detalleOrden) {
		super();
		this.id = id;
		this.nombresolicitante = nombresolicitante;
		this.informacionsolicitante = informacionsolicitante;
		this.adscripcion = adscripcion;
		this.clave_proveedor = clave_proveedor;
		this.infoproveedor = infoproveedor;
		this.infolibro = infolibro;
		this.autor = autor;
		this.titulo = titulo;
		this.anio = anio;
		this.isbn = isbn;
		this.formato = formato;
		this.fechacompra = fechacompra;
		this.total = total;
		this.numero = numero;
		this.usuario = usuario;
		this.detalleOrden = detalleOrden;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombresolicitante() {
		return nombresolicitante;
	}

	public void setNombresolicitante(String nombresolicitante) {
		this.nombresolicitante = nombresolicitante;
	}

	public String getInformacionsolicitante() {
		return informacionsolicitante;
	}

	public void setInformacionsolicitante(String informacionsolicitante) {
		this.informacionsolicitante = informacionsolicitante;
	}

	public String getAdscripcion() {
		return adscripcion;
	}

	public void setAdscripcion(String adscripcion) {
		this.adscripcion = adscripcion;
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

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
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

	public Date getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}

	public DetalleOrden getDetalleOrden() {
		return detalleOrden;
	}

	public void setDetalleOrden(DetalleOrden detalleOrden) {
		this.detalleOrden = detalleOrden;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Tbl_usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Tbl_usuarios usuario) {
		this.usuario = usuario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero; 
	}

	@Override
	public String toString() {
		return "OrdenCompra [id=" + id + ", nombresolicitante=" + nombresolicitante
				+ ", informacionsolicitante=" + informacionsolicitante + ", adscripcion=" + adscripcion
				+ ", clave_proveedor=" + clave_proveedor + ", infoproveedor=" + infoproveedor + ", infolibro=" + infolibro
				+ ", autor=" + autor + ", titulo=" + titulo + ", anio=" + anio + ", isbn=" + isbn + ", formato="
				+ formato + ", fechaCompra=" + fechacompra + ", total=" + total + ", numero=" + numero + ", usuario="
				+ usuario + ", detalleOrden=" + detalleOrden + "]";
	}
	
}

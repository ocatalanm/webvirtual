package com.feria.webvirtual.dao.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Temporal(TemporalType.DATE)
	private Date fechacompra;
	private double total;
	private String numero;
	
	@ManyToOne
	private Tbl_usuarios usuario;
	
	@OneToMany(mappedBy="ordenCompra")
	private List<DetalleOrden> detalleOrden;
	
	//@OneToOne(mappedBy = "ordenCompra")
	//private DetalleOrden detalleOrden;
	
	public OrdenCompra() {
		
	}

	public OrdenCompra(Integer id, String nombresolicitante, String informacionsolicitante, String adscripcion,
			Date fechacompra, double total, String numero, Tbl_usuarios usuario, List<DetalleOrden> detalleOrden) {
		super();
		this.id = id;
		this.nombresolicitante = nombresolicitante;
		this.informacionsolicitante = informacionsolicitante;
		this.adscripcion = adscripcion;
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

	public Date getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}

	public List<DetalleOrden> getDetalleOrden() {
		return detalleOrden;
	}

	public void setDetalleOrden(List<DetalleOrden> detalleOrden) {
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
		return "OrdenCompra [id=" + id + ", nombresolicitante=" + nombresolicitante + ", informacionsolicitante="
				+ informacionsolicitante + ", adscripcion=" + adscripcion + ", fechacompra=" + fechacompra + ", total="
				+ total + ", numero=" + numero + ", usuario=" + usuario + ", detalleOrden=" + detalleOrden + "]";
	}
	
}

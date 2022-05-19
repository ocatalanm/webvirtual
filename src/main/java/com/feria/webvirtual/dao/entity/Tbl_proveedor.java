package com.feria.webvirtual.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_proveedor")
public class Tbl_proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_proveedor;
	
	
	private String nombre_imagen;
	@Column(name="titulo")
	private String titulo;
	private String autor; 
	private String editorial;
	private int anio;
	private String  isbn;
	private String edicion;
	private String url;
	private String tema_1;
	private String tema_2;
	private String tema_3;
	private double precio_dolares;
	private Integer tipo_fto_electronico;
	private Integer tipo_fto_fisico;
	private String clave_proveedor;
    
	public String getNombre_imagen() {
		return nombre_imagen;
	}
	public void setNombre_imagen(String nombre_imagen) {
		this.nombre_imagen = nombre_imagen;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTema_1() {
		return tema_1;
	}
	public void setTema_1(String tema_1) {
		this.tema_1 = tema_1;
	}
	public String getTema_2() {
		return tema_2;
	}
	public void setTema_2(String tema_2) {
		this.tema_2 = tema_2;
	}
	public String getTema_3() {
		return tema_3;
	}
	public void setTema_3(String tema_3) {
		this.tema_3 = tema_3;
	}
	public double getPrecio_dolares() {
		return precio_dolares;
	}
	public void setPrecio_dolares(double precio_dolares) {
		this.precio_dolares = precio_dolares;
	}
	
	public String getClave_proveedor() {
		return clave_proveedor;
	}
	public void setClave_proveedor(String clave_proveedor) {
		this.clave_proveedor = clave_proveedor;
	}
	public Long getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(Long id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getTipo_fto_electronico() {
		return tipo_fto_electronico;
	}
	public void setTipo_fto_electronico(Integer tipo_fto_electronico) {
		this.tipo_fto_electronico = tipo_fto_electronico;
	}
	public Integer getTipo_fto_fisico() {
		return tipo_fto_fisico;
	}
	public void setTipo_fto_fisico(Integer tipo_fto_fisico) {
		this.tipo_fto_fisico = tipo_fto_fisico;
	}
	@Override
	public String toString() {
		return "Tbl_proveedor [id_proveedor=" + id_proveedor + ", nombre_imagen=" + nombre_imagen + ", titulo=" + titulo
				+ ", autor=" + autor + ", editorial=" + editorial + ", anio=" + anio + ", isbn=" + isbn + ", edicion="
				+ edicion + ", url=" + url + ", tema_1=" + tema_1 + ", tema_2=" + tema_2 + ", tema_3=" + tema_3
				+ ", precio_dolares=" + precio_dolares + ", tipo_fto_electronico=" + tipo_fto_electronico
				+ ", tipo_fto_fisico=" + tipo_fto_fisico + ", clave_proveedor=" + clave_proveedor + "]";
	}
}

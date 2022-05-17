package com.feria.webvirtual.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_categorias")
public class Tbl_categorias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer id_tema;
	private String id_descr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_tema() {
		return id_tema;
	}
	public void setId_tema(Integer id_tema) {
		this.id_tema = id_tema;
	}
	public String getId_descr() {
		return id_descr;
	}
	public void setId_descr(String id_descr) {
		this.id_descr = id_descr;
	}
	@Override
	public String toString() {
		return "Tbl_categorias [id=" + id + ", id_tema=" + id_tema + ", id_descr=" + id_descr + "]";
	}
	
	
	
	
	
	
}

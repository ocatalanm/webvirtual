package com.feria.webvirtual.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usuarios")
public class Tbl_usuarios {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer perfil;
  private String password;
  private Integer cuenta;
  private String entidad;
  private String nombre;
  private String direccion;
  private String correo;
  private Integer num_trabajador;
  private String departamento;
  private String fecha_nacimiento;
  private String tutor;
	      
	      
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPerfil() {
		return perfil;
	}
	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getCuenta() {
		return cuenta;
	}
	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Integer getNum_trabajador() {
		return num_trabajador;
	}
	public void setNum_trabajador(Integer num_trabajador) {
		this.num_trabajador = num_trabajador;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	@Override
	public String toString() {
		return "Tbl_usuarios [id=" + id + ", perfil=" + perfil + ", password=" + password + ", cuenta=" + cuenta
				+ ", entidad=" + entidad + ", nombre=" + nombre + ", direccion=" + direccion + ", correo="
				+ correo + ", num_trabajador=" + num_trabajador + ", departamento=" + departamento
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", tutor=" + tutor + "]";
	}
		      
		      
		      
		       

}

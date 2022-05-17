package com.feria.webvirtual.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.feria.webvirtual.dao.entity.Tbl_proveedor;
import com.feria.webvirtual.dao.entity.Tbl_usuarios;

@Repository
public interface ITbl_proveedorRepository extends JpaRepository<Tbl_proveedor, Long> {
	//List<Tbl_proveedor> findUserByUsernameLike(@Param("titulo") String titulo);
	
	
	@Query("select u from Tbl_proveedor u where  u.titulo  like %?1% or u.autor  like %?1% or u.editorial  like %?1% ")
	List<Tbl_proveedor>  findBytbl_proveedorTitulo(String busqueda);
	
	@Query("select u from Tbl_proveedor u where  u.id_proveedor =?1")
	Tbl_proveedor  findByIDtbl_proveedorTitulo(long id_proveedor);
	
	@Query("select u from Tbl_usuarios u where  u.correo =?1  ")
	Tbl_usuarios  findByIDtbl_usuarios(String indentificador);
	
	
	
}

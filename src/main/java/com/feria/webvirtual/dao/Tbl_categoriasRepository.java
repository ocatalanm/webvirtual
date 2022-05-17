package com.feria.webvirtual.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.feria.webvirtual.dao.entity.Tbl_categorias;


@Repository
public interface Tbl_categoriasRepository extends CrudRepository<Tbl_categorias, Long>  {
	
	@Query("select u from Tbl_categorias u where u.id_tema=?1")
	List<Tbl_categorias>  findBytbl_categorias(Integer id_tema);
	

}

package com.feria.webvirtual.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.feria.webvirtual.dao.entity.Tbl_usuarios;

@Repository
public interface Tbl_proveedorCrudRepository extends CrudRepository<Tbl_usuarios, Long>  {
	
	@Transactional
	@Modifying
	@Query("update Tbl_usuarios u set u.password=:password where  u.correo =:username")
	int updatePassByUsername(@Param(value = "username") String username,@Param(value = "password")String password);

}

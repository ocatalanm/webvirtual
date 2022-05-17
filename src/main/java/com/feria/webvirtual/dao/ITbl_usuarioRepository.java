package com.feria.webvirtual.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feria.webvirtual.dao.entity.Tbl_usuarios;

@Repository
public interface ITbl_usuarioRepository extends JpaRepository<Tbl_usuarios, Integer>{
	
	
	
}

package com.feria.webvirtual.service;

import java.util.Optional;

import com.feria.webvirtual.dao.entity.Tbl_usuarios;

public interface ITbl_usuariosService {
	
	Optional<Tbl_usuarios> findById(Integer id);

}

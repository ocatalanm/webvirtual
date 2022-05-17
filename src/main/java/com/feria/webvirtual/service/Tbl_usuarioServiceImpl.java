package com.feria.webvirtual.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feria.webvirtual.dao.ITbl_usuarioRepository;
import com.feria.webvirtual.dao.entity.Tbl_usuarios;

@Service
public class Tbl_usuarioServiceImpl implements ITbl_usuariosService{

	@Autowired
	private ITbl_usuarioRepository usuarioRepository;

	@Override
	public Optional<Tbl_usuarios> findById(Integer id) {		
		return usuarioRepository.findById(id);
	}
	
	
	
	
}

package com.feria.webvirtual.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feria.webvirtual.dao.ITbl_proveedorRepository;
import com.feria.webvirtual.dao.entity.Tbl_proveedor;

@Service
public class Tbl_proveedorServiceImpl implements Tbl_proveedorService {
	
	@Autowired
	private ITbl_proveedorRepository tbl_proveedorRepository;

	@Override
	public Tbl_proveedor save(Tbl_proveedor tbl_proveedor) {
		return tbl_proveedorRepository.save(tbl_proveedor);
	}

	@Override
	public Optional<Tbl_proveedor> get(Long id) {
		return tbl_proveedorRepository.findById(id);
	}

	@Override
	public void update(Tbl_proveedor tbl_proveedor) {
		tbl_proveedorRepository.save(tbl_proveedor);
	}

	@Override
	public void delete(Long id) {
		tbl_proveedorRepository.deleteById(id);
	}
	
}

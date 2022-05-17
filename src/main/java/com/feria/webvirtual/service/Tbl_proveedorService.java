package com.feria.webvirtual.service;

import java.util.Optional;

import com.feria.webvirtual.dao.entity.Tbl_proveedor;

public interface Tbl_proveedorService {
	
	public Tbl_proveedor save(Tbl_proveedor tbl_proveedor);
	public Optional<Tbl_proveedor> get(Long id);
	public void update(Tbl_proveedor tbl_proveedor);
	public void delete(Long id);

}

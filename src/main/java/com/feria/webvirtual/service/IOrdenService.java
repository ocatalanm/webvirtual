package com.feria.webvirtual.service;

import java.util.List;

import com.feria.webvirtual.dao.entity.OrdenCompra;

public interface IOrdenService {
	
	List<OrdenCompra> findAll();
	
	OrdenCompra save (OrdenCompra orden);
	
	String generarNumeroOrden();
	
}

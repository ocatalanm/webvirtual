package com.feria.webvirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feria.webvirtual.dao.IDetalleOrdenRepository;
import com.feria.webvirtual.dao.entity.DetalleOrden;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService {

	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

}

package com.feria.webvirtual.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feria.webvirtual.dao.entity.OrdenCompra;

@Repository
public interface IOrdenRepository extends JpaRepository<OrdenCompra, Integer>{
	
}

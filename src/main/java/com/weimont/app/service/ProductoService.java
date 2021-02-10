package com.weimont.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimont.app.entity.Producto;
import com.weimont.app.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> traerTodos(){
		return (List<Producto>) productoRepository.findAll();
	}
	
	
}

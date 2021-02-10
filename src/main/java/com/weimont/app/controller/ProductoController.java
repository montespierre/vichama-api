package com.weimont.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weimont.app.entity.Producto;
import com.weimont.app.service.ProductoService;

@RestController
@RequestMapping("/api/v2/productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/mostrar")
	public List<Producto> traerTodos(){
		return productoService.traerTodos();
	}
	
}

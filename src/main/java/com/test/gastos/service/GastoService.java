package com.test.gastos.service;

import java.util.List;

import javax.jws.WebService;

import com.test.gastos.model.Gasto;

@WebService
public interface GastoService {
	
	/**
	 * Metodo para crear un gasto
	 * @param gasto
	 * @return
	 */
	Gasto crearGasto(Gasto gasto);
	
	/**
	 * Metodo para devolver todos los gastos
	 * @return
	 */
	List<Gasto> obtenerTodos();
}

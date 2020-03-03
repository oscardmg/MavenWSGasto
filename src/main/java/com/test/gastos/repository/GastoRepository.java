package com.test.gastos.repository;

import java.util.List;

import com.test.gastos.model.Gasto;


public interface GastoRepository {
	
	/**
	 * Metodo para crear un gasto
	 * @param tarjeta
	 * @return
	 */
	Gasto crearGasto(Gasto tarjeta);
	
	/**
	 * Metodo para devolver todos los gastos
	 * @return
	 */
	List<Gasto> obtenerTodos();
}

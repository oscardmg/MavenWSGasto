package com.test.gastos.repository;

import java.util.ArrayList;
import java.util.List;

import com.test.gastos.model.Gasto;



public class GastoRepositoryImpl implements GastoRepository {


	private static List<Gasto> gastos = new ArrayList<Gasto>();
	
	@Override
	public Gasto crearGasto(Gasto gasto) {
		System.out.println("Crear Gasto ::");
		gastos.add(gasto);
		return gasto;
	}

	@Override
	public List<Gasto> obtenerTodos() {
		System.out.println("Obtener todos las Gastos");
		return gastos;
	}

	
}

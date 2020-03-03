package com.test.gastos.service;

import java.util.List;

import javax.jws.WebService;

import com.test.gastos.model.Gasto;
import com.test.gastos.repository.GastoRepositoryImpl;

@WebService(endpointInterface = "com.test.gastos.service.GastoService")
public class GastoServiceImpl implements GastoService{
	
	GastoRepositoryImpl gastoRepository = new GastoRepositoryImpl();

	@Override
	public Gasto crearGasto(Gasto gasto) {
		return gastoRepository.crearGasto(gasto);
	}

	@Override
	public List<Gasto> obtenerTodos() {
		return gastoRepository.obtenerTodos();
	}

}

package com.test.gastos.model;

import java.util.Date;

public class Gasto {
	Date fecha;
	Integer valor;
	String idCliente;
	FormaPagoEnum formaPago;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public FormaPagoEnum getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(FormaPagoEnum formaPago) {
		this.formaPago = formaPago;
	}
	
	
}

package com.edu.ec.pw.api.service;

import com.edu.ec.pw.api.repository.modelo.Vehiculo;

public interface IVehiculoService {
	public Vehiculo buscar(String Placa);
	public void actualizar(Vehiculo vehiculo);
	public void borrar(String placa);
	public void agregar(Vehiculo vehiculo);
	
	

}

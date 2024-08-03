package com.edu.ec.pw.api.repository;

import java.util.List;

import com.edu.ec.pw.api.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
	public Vehiculo seleccionar(String placa);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String placa);
	public void insertar(Vehiculo vehiculo);
	public List<Vehiculo> seleccionarTodos();

}

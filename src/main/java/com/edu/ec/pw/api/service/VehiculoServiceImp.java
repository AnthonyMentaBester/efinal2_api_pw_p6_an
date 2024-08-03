package com.edu.ec.pw.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.ec.pw.api.repository.IVehiculoRepository;
import com.edu.ec.pw.api.repository.modelo.Vehiculo;

@Service
@Transactional
public class VehiculoServiceImp implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public Vehiculo buscar(String Placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.seleccionar(Placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(vehiculo);
		
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.eliminar(placa);
		
	}

	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(vehiculo);
	}
	
	

}

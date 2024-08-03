package com.edu.ec.pw.api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.ec.pw.api.repository.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class VehiculoRepositoryImp implements IVehiculoRepository{

	
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Vehiculo seleccionar(String placa) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vehiculo.class, placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(placa));
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}
	
	@Override
	public List<Vehiculo> seleccionarTodos() {
		// TODO Auto-generated method stub
		
		TypedQuery<Vehiculo> myQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class);
        return myQuery.getResultList();
	}
	
	

}

package com.edu.ec.pw.api.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	
	@SequenceGenerator(name = "seq_vehiculo",sequenceName = "seq_vehiculo",allocationSize = 1)
	@GeneratedValue(generator = "seq_vehiculo",strategy = GenerationType.SEQUENCE)
	
	@Id
	@Column(name = "vehi_id")
	private Integer id;
	
	@Column(name = "vehi_placa")
	private String Placa;
	
	@Column(name = "vehi_marca")
	private String marca;
	
	@Column(name = "vehi_modelo")
	private String modelo;
	
	@Column(name = "vehi_color")
	private String color;
	
	
	@Column(name = "vehi_precio")
	private Integer precio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}

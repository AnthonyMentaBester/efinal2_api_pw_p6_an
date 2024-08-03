package com.edu.ec.pw.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ec.pw.api.repository.modelo.Vehiculo;
import com.edu.ec.pw.api.service.IVehiculoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin
@RequestMapping(path = "/vehiculos")
public class VehiculoController {
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	//http:localhost8080/API/v1.0/Concesionario/vehiculos
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Vehiculo> agregar(@RequestBody Vehiculo vehiculo) {
		//TODO: process POST request	
		return ResponseEntity.status(236).body(vehiculo);
	}
	//http:localhost8080/API/v1.0/Concesionario/vehiculos/todos
	@GetMapping(path = "/todos",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Vehiculo> buscar(@RequestBody Vehiculo vehiculo) {
		return ResponseEntity.status(236).body(vehiculo);
	}
	
	//http:localhost8080/API/v1.0/Concesionario/vehiculos/atm
	@DeleteMapping(path = "/{placa}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Vehiculo> buscar(@RequestBody Vehiculo vehiculo,@PathVariable String placa) {
		Vehiculo vehiculo2 = this.vehiculoService.buscar(placa);
		vehiculo2.getPlaca();
		return ResponseEntity.status(246).body(vehiculo2);
	}
	

	//http:localhost8080/API/v1.0/Concesionario/vehiculos/algunos
		@GetMapping(path = "/vehiculo/datos",produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Vehiculo> ver(@RequestBody Vehiculo vehiculo) {
			return ResponseEntity.status(236).body(vehiculo);
		}
	

}



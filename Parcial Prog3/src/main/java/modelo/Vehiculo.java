package modelo;

import excepciones.VehiculoIncompletoException;
import excepciones.VehiculoSinMatriculaException;

public class Vehiculo {
	private Integer idVehiculo;
	private String marcaModelo;
	private String patente;
	private Integer anio;
	
	

	public Vehiculo(Integer idVehiculo, String marcaModelo, String patente, Integer anio) {
		
		this.idVehiculo = idVehiculo;
		this.marcaModelo = marcaModelo;
		this.patente = patente;
		this.anio = anio;
	}



	public static Vehiculo factoryVehiculo(Integer idVehiculo, String marcaModelo, String patente, Integer anio)throws VehiculoIncompletoException {
		if(idVehiculo==null	|| marcaModelo==null|| patente==null||anio==null) {
			throw new VehiculoIncompletoException();
		}
			return new Vehiculo(idVehiculo, marcaModelo, patente, anio);
		
		
	}



	



	public Integer getIdVehiculo() {
		return idVehiculo;
	}



	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}



	public String getMarcaModelo() {
		return marcaModelo;
	}



	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}



	public String getPatente() {
		return patente;
	}



	public void setPatente(String patente) {
		this.patente = patente;
	}



	public Integer getAnio() {
		return anio;
	}



	public void setAnio(Integer anio) {
		this.anio = anio;
	}



	public String mostrarVehiculo() {
		
		return this.marcaModelo + " modelo " + this.anio + " - Patente " + this.patente;
	}

	 
	}


	


	



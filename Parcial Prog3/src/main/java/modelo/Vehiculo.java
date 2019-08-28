package modelo;

import excepciones.VehiculoIncompletoException;
import excepciones.VehiculoSinMatriculaException;

public class Vehiculo {
	private Integer idVehiculo;
	private String marcaModelo;
	private String patente;
	private Integer anio;
	
	

	public Vehiculo(Integer idVehiculo, String marcaModeloString, String patente, Integer anio) {
		
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



	


	

}

package ar.edu.undec;

import java.util.ArrayList;
import java.util.List;

public class GestorPasajeros {
	
	private List<Pasajero> pasajeros;

	public GestorPasajeros() {
		this.pasajeros= new ArrayList<Pasajero>();
	}
	
	public boolean registrarPasajero(String cuil, String apellido, String nombres, String telefono) throws ExcepcionDatosIncorrectos {
		boolean existente = true;
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil().equals(cuil)) {
				existente = false;
			}
		}
		try {
			if(existente) {			
				Pasajero agregar = new Pasajero(pasajeros.size()+1, cuil, apellido, nombres, telefono);
				pasajeros.add(agregar);
				return existente;
			}else	return false;
		} catch (ExcepcionDatosIncorrectos ex) {
			System.err.println(ex.getMessage());
			return false;
		}
	}
	
	public Pasajero consultarPasajeroPorCuil(String cuil) {
		Pasajero resultadoPasajero = new Pasajero();
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil().equals(cuil))
				resultadoPasajero = pasajero;
		}
		return resultadoPasajero;
	}
	
	
	
	public boolean existenciaPasajero(String cuil) {
		boolean devolver = false;
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil().equals(cuil))
				devolver = true;
		}
		if(devolver)
			return true;
		else return false;
	}
	
	public boolean borrarPasajero(String cuil) {
		Pasajero eliminar = new Pasajero();
		for (int i = 0; i < pasajeros.size();i++) {
				if (pasajeros.get(i).getCuil().equals(cuil)) {
					eliminar = pasajeros.get(i);
				}
			}
		return pasajeros.remove(eliminar);		
	}
	
	
	public boolean modificarPasajero(String cuil, String nombres, String telefono) {
		if(existenciaPasajero(cuil)) {
			int i = 0;
			for(i = 0; i < pasajeros.size(); i++) {
				if(pasajeros.get(i).getCuil().equals(cuil))
					break;
			}
			Pasajero actualizar = this.consultarPasajeroPorCuil(cuil);
			actualizar.setNombres(nombres);
			actualizar.setTelefono(telefono);
			pasajeros.set(i, actualizar);
			return true;
		}else return false;
	}
	
	public List<Pasajero> mostrarTodosLosPasajeros(){
		return this.pasajeros;
		
	}
		
	}

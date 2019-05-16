package ar.edu.undec;

import java.util.ArrayList;
import java.util.List;

public class GestorUbicacion {
	
	
	
	private List<Ciudad> ciudades;
	private List <Aeropuerto>aeropuertos;
	
	public GestorUbicacion() {
		
		this.ciudades= new ArrayList<Ciudad>();
		this.aeropuertos = new ArrayList<Aeropuerto>();
	}
	
	

	
	public boolean registrarCiudad(String nombre,String codigopostal) throws ExcepcionDatosIncorrectos {
		boolean existente = true;
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().contentEquals(codigopostal)) {
				existente = false;
			}
		}
		try {
			if(existente) {			
				Ciudad agregar = new Ciudad(ciudades.size()+1, nombre, codigopostal);
				ciudades.add(agregar);
				return existente;
			}else	return false;
		} catch (ExcepcionDatosIncorrectos ex) {
			System.err.println(ex.getMessage());
			return false;
		}
	}

	public Ciudad BuscarCiudadPorCodigoPostal(String codigoPostal) {

		Ciudad resultadoCiudad = new Ciudad();
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codigoPostal))
				resultadoCiudad = ciudad;
		}
		return resultadoCiudad;
	}
	
	public boolean existenciaCiudad(String codigoPostal) {
		boolean devolver = false;
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codigoPostal))
				devolver = true;
		}
		if(devolver)
			return true;
		else return false;
	}


	public Ciudad buscarCiudadCodigoPostal(String codigoPostal) {
		Ciudad resultadoCiudad = new Ciudad();
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codigoPostal))
				resultadoCiudad = ciudad;
		}
		return resultadoCiudad;
	}
	
	public boolean existenciaCiudades(String codigoPostal) {
		boolean devolver = false;
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codigoPostal))
				devolver = true;
		}
		if(devolver)
			return true;
		else return false;
	}
	public boolean borrarCiudad(String codigoPostal) {
		Ciudad eliminar = new Ciudad();
		for (int i = 0; i < ciudades.size();i++) {
				if (ciudades.get(i).getCodigoPostal().equals(codigoPostal)) {
					eliminar = ciudades.get(i);
				}
			}
		return ciudades.remove(eliminar);		
	}
	
	public boolean actualizarCiudad(String codigoPostal, String nombres) {
		if(existenciaCiudad(codigoPostal)) {
			int i = 0;
			for(i = 0; i < ciudades.size(); i++) {
				if(ciudades.get(i).getCodigoPostal().equals(codigoPostal))
					break;
			}
		
			Ciudad modificar = this.BuscarCiudadPorCodigoPostal(codigoPostal);
			modificar.setNombre(nombres);
			
			ciudades.set(i, modificar);
			return true;
		}else return false;
	}
	
	public List<Ciudad> mostrarTodasLasCiudades(){
		return this.ciudades;
		
	}
		
	public boolean registrarAeropuerto(String nombre, Ciudad ciudad, String codigo) throws ExcepcionDatosIncorrectos {
		boolean existente = true;
		for (Aeropuerto aeropuerto : aeropuertos) {
			if(aeropuerto.getCodigo().equals(codigo)) {
				existente = false;
			}
		}
		try {
			if(existente) {			
				Aeropuerto agregar = new Aeropuerto(aeropuertos.size()+1, nombre, ciudad,codigo);
				aeropuertos.add(agregar);
				return existente;
			}else	return false;
		} catch (ExcepcionDatosIncorrectos ex) {
			System.err.println(ex.getMessage());
			return false;
		}
	}
	

	public Aeropuerto buscarAeropuertoCodigo(String codigo) {
		Aeropuerto resultadoAeropuerto = new Aeropuerto();
		for (Aeropuerto aeropuerto : aeropuertos) {
			if(aeropuerto.getCodigo().equals(codigo))
				resultadoAeropuerto = aeropuerto;
		}
		return resultadoAeropuerto;
	}
	
	public boolean existenciaAeropuerto(String codigo) {
		boolean devolver = false;
		for (Aeropuerto aeropuerto : aeropuertos) {
			if(aeropuerto.getCodigo().equals(codigo))
				devolver = true;
		}
		if(devolver)
			return true;
		else return false;
	}
	
	public boolean borrarAeropuerto(String codigo) {
		Aeropuerto eliminar = new Aeropuerto();
		for (int i = 0; i < aeropuertos.size();i++) {
				if (aeropuertos.get(i).getCodigo().equals(codigo)) {
					eliminar = aeropuertos.get(i);
				}
			}
		return aeropuertos.remove(eliminar);		
	}
	
	public boolean actualizarAeropuerto(String codigo, String nombre) {
		if(existenciaCiudad(codigo)) {
			int i = 0;
			for(i = 0; i < aeropuertos.size(); i++) {
				if(aeropuertos.get(i).getCodigo().equals(codigo))
					break;
			}
		
			Aeropuerto cambiar = this.buscarAeropuertoCodigo(codigo);
			cambiar.setNombre(nombre);
				
			aeropuertos.set(i, cambiar);
			return true;
		}else return false;
	}
	
	public List<Aeropuerto> mostrarTodosLosAeropuerto(){
		return this.aeropuertos;
		
	}
	
}



package ar.edu.undec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPiloto {
	
	
	private List<Piloto> pilotos;

	public GestorPiloto() {		
		this.pilotos = new ArrayList<Piloto>(); 
	}
	
	public boolean registrarPiloto(String apellido, String nombres, String documento, LocalDate fechaNacimiento) {
		boolean existe = true;
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumento().equals(documento)) {
				existe = false;
			}
		}
		try {
			if(existe) {			
				Piloto agregar = new Piloto(pilotos.size()+1, apellido, nombres, documento, fechaNacimiento);
				pilotos.add(agregar);
				return existe;
			}else	return false;
		} catch (ExcepcionDatosIncorrectos ex) {
			System.err.println(ex.getMessage());
			return false;
		}
	}
	
	public Piloto buscarPilotoPorDNI(String documen) {
		Piloto resultadoPiloto = new Piloto();
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumento().equals(documen))
				resultadoPiloto = piloto;
		}
		return resultadoPiloto;
	}
	

	public boolean existenciaPiloto(String documento) {
		boolean devolver = false;
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumento().equals(documento))
				devolver = true;
		}
		if(devolver)
			return true;
		else return false;
	}
	
	
	public boolean borrarPiloto(String documento) {
		Piloto eliminar = new Piloto();
		for (int i = 0; i < pilotos.size();i++) {
				if (pilotos.get(i).getDocumento().equals(documento)) {
					eliminar = pilotos.get(i);
				}
			}
		return pilotos.remove(eliminar);		
	}
	

	public boolean modificarPiloto(String documento, String apellido, String nombres, LocalDate fechaNacimiento) {
		if(existenciaPiloto(documento)) {
			int i = 0;
			for(i = 0; i < pilotos.size(); i++) {
				if(pilotos.get(i).getDocumento().equals(documento))
					break;
			}
		
			Piloto actualizar = this.buscarPilotoPorDNI(documento);
			actualizar.setApellido(apellido);
			actualizar.setNombre(nombres);
			actualizar.setFechaNacimiento(fechaNacimiento);
			
			pilotos.set(i, actualizar);
			return true;
		}else return false;
	}
	
	public List<Piloto> mostrarTodosLosPilotos(){
		return this.pilotos;
		
	}
}

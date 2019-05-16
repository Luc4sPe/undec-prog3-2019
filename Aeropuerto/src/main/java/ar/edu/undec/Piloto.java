package ar.edu.undec;

import java.time.LocalDate;
import java.time.Period;

public class Piloto {
	private Integer idPiloto;
	private String apellido;
	private String nombre;
	private String documento;
	private LocalDate fechaNacimiento;
	
	public Piloto(Integer idPiloto, String apellido,String nombre ,String documento, LocalDate fechaNacimiento) throws ExcepcionDatosIncorrectos {
		
		if( (Period.between(fechaNacimiento, LocalDate.now()).getYears()) < 18){
			throw new ExcepcionDatosIncorrectos("El Piloto debe ser mayor de Edad");			

		}else if(documento.isEmpty()) {
			
			throw new ExcepcionDatosIncorrectos("El campo (DNI) no puede estar vacio");
			
		}else {
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		}
	}
	
	public Piloto() {}
	
	public Integer getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(Integer idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	

}

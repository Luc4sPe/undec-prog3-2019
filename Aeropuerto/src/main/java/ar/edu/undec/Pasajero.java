package ar.edu.undec;

public class Pasajero {
	
	private Integer idPasajero;
	private String cuil;
	private String apellido;
	private String nombres;
	private String telefono;
	
	public Pasajero(Integer idPasajero, String cuil, String apellido, String nombres, String telefono) throws ExcepcionDatosIncorrectos {
		
		if(cuil.isEmpty()) {
			
			throw new ExcepcionDatosIncorrectos("El campo (CUIL) no puede estar vacio");
			
		}else if(cuil.length() < 11 || cuil.length() > 14){
			
			throw new ExcepcionDatosIncorrectos(" CUIL Incorrecto");
			
		}else {
			this.idPasajero = idPasajero;
			this.cuil = cuil;
			this.apellido = apellido;
			this.nombres = nombres;
			this.telefono = telefono;
		}
	}
	public Pasajero() {
		
	}
	public Integer getIdPasajero() {
		return idPasajero;
	}
	public void setIdPasajero(Integer idPasajero) {
		this.idPasajero = idPasajero;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
 
}

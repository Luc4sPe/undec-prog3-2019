package ar.edu.undec;

public class Ciudad {

	private Integer idCiudad;
	private String nombre;
	private String codigoPostal;
	public Ciudad(Integer idCiudad, String nombre, String codigoPostal) {
	
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}
	public Integer getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
	

}

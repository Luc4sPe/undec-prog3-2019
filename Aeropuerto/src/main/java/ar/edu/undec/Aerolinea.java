package ar.edu.undec;

public class Aerolinea {
	private Integer idAerolinea;
	private String nombre;
	
	public Aerolinea(Integer idAerolinea, String nombre) {
		
		
		
		this.idAerolinea = idAerolinea;
		this.nombre = nombre;
	}

	public Integer getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(Integer idAerolinea) {
		this.idAerolinea = idAerolinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}

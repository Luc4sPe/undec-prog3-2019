package ar.edu.undec;



public class Ciudad {

	private Integer idCiudad;
	private String nombre;
	private String codigoPostal;
	
	public Ciudad(Integer idCiudad, String nombre, String codigoPostal) throws ExcepcionDatosIncorrectos {
		
		if(nombre.isEmpty()) {
			
			throw new ExcepcionDatosIncorrectos("El campo (nombre) no puede estar vacio");
			
		}else if(codigoPostal.isEmpty()){
			
			throw new ExcepcionDatosIncorrectos("El campo (CodigoPostal) no puede estar vacio");
			
		}else {
		
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		}
	}
	
	public Ciudad() {
		
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

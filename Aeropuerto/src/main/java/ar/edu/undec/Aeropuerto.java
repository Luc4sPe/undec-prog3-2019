package ar.edu.undec;

public class Aeropuerto {
	
	private Integer idAeropuerto;
	private String nombre;
	private Ciudad cuidad;
	private String codigo;
	public Aeropuerto(Integer idAeropuerto, String nombre, Ciudad cuidad, String codigo) throws ExcepcionDatosIncorrectos {
		
if(nombre.isEmpty()) {
			
			throw new ExcepcionDatosIncorrectos("El campo (nombre) no puede estar vacio");
			
		}else if(codigo.isEmpty()){
			
			throw new ExcepcionDatosIncorrectos("El campo (Codigo) no puede estar vacio");
			
		}else {
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.cuidad = cuidad;
		this.codigo = codigo;
		}
	}
	
	public Aeropuerto() {
		
	}
	public Integer getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(Integer idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Ciudad getCuidad() {
		return cuidad;
	}
	public void setCuidad(Ciudad cuidad) {
		this.cuidad = cuidad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	

}

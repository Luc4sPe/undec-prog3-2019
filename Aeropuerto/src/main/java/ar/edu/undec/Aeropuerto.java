package ar.edu.undec;

public class Aeropuerto {
	
	private Integer idAeropuerto;
	private String nombre;
	private Ciudad cuidad;
	private String codigo;
	public Aeropuerto(Integer idAeropuerto, String nombre, Ciudad cuidad, String codigo) {
		
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.cuidad = cuidad;
		this.codigo = codigo;
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

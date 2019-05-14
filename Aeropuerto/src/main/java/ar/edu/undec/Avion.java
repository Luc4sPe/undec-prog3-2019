package ar.edu.undec;

import java.util.List;

public class Avion {
	private Integer idAvion;
	private String modelo;
	private String matricula;
	private List<Asiento> asientos;
	public Avion(Integer idAvion, String modelo, String matricula, List<Asiento> asientos) {
		
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.asientos = asientos;
	}
	public Integer getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(Integer idAvion) {
		this.idAvion = idAvion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public List<Asiento> getAsientos() {
		return asientos;
	}
	public void setAsientos(List<Asiento> asientos) {
		this.asientos = asientos;
	}

	
}

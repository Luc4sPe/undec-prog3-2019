package ar.edu.undec;

import java.time.LocalDateTime;
import java.util.List;

public class Vuelo {

	private String codigoVuelo;
	private Aeropuerto salidAeropuerto;
	private LocalDateTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDateTime fechaHoraArribo;
	private Aerolinea aerolinea;
	private List<Piloto> pilotos;
	private Avion avion;
	private List<Asignacion> pasajero;
	
	public Vuelo(String codigoVuelo, Aeropuerto salidAeropuerto, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, List<Piloto> pilotos, Avion avion,
			List<Asignacion> pasajero) {
		
		this.codigoVuelo = codigoVuelo;
		this.salidAeropuerto = salidAeropuerto;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = pilotos;
		this.avion = avion;
		this.pasajero = pasajero;
	}
	
	public String getCodigoVuelo() {
		return codigoVuelo;
	}
	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}
	public Aeropuerto getSalidAeropuerto() {
		return salidAeropuerto;
	}
	public void setSalidAeropuerto(Aeropuerto salidAeropuerto) {
		this.salidAeropuerto = salidAeropuerto;
	}
	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public List<Piloto> getPilotos() {
		return pilotos;
	}
	public void setPilotos(List<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public List<Asignacion> getPasajero() {
		return pasajero;
	}
	public void setPasajero(List<Asignacion> pasajero) {
		this.pasajero = pasajero;
	}
	
	
	
	
}

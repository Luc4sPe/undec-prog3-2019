package modelo;

import java.time.LocalDate;

import excepciones.ServiceFechaIncorrectaException;
import excepciones.ServiceIncompletoException;

public class Service {
	
	private Integer idService;
	private Vehiculo vehiculo;
	private Cliente cliente;
	private LocalDate fechaService;
	private String detalleService;
	private Float precio;
	

	public Service(Integer idService, Vehiculo vehiculo, Cliente cliente, LocalDate fechaService,
			String detalleService, Float precio) {
		
		this.idService = idService;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.fechaService = fechaService;
		this.detalleService = detalleService;
		this.precio = precio;
	}


	public static Service factoryService(Integer idService, Vehiculo vehiculo, Cliente cliente, LocalDate fechaService, String detalleService,
			Float precio) throws ServiceIncompletoException,ServiceFechaIncorrectaException{
		if(idService==null||vehiculo==null||cliente==null||fechaService==null||detalleService==null||precio==null) {
			throw new ServiceIncompletoException("Algun Campo Incompleto");
		}
		else if (fechaService.isBefore(LocalDate.now())) {
			return new Service(idService, vehiculo, cliente, fechaService, detalleService, precio);
		} else {
			throw new ServiceFechaIncorrectaException();
		}
			
		}
			
																															public Integer getIdService() {
		return idService;
	}


	public void setIdService(Integer idService) {
		this.idService = idService;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public LocalDate getFechaService() {
		return fechaService;
	}


	public void setFechaService(LocalDate fechaService) {
		this.fechaService = fechaService;
	}


	public String getDetalleService() {
		return detalleService;
	}


	public void setDetalleService(String detalleService) {
		this.detalleService = detalleService;
	}


	public Float getPrecio() {
		return precio;
	}


	public void setPrecio(Float precio) {
		this.precio = precio;
	}


	//\nVehiculo: VW Golf modelo 2009 - Patente ABC123\
	public String mostrarResumen() {
																															//this.marcaModelo + " modelo " + this.anio + " - Patente " + this.patente;
		return "Service Nro: " + this.idService + "\nCliente: " + this.cliente.getApellido()+", "+this.cliente.getNombre()+" - "+this.cliente.getTelefono() + "\nVehiculo: " + this.vehiculo.getMarcaModelo()+" modelo "+this.vehiculo.getAnio()+" - Patente "+this.vehiculo.getPatente() + "\nTrabajo Realizado: " + this.detalleService;
	}
		
	}



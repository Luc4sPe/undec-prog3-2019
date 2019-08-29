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
			throw new ServiceIncompletoException();
		}
		else if (fechaService.isBefore(LocalDate.now())) {
			return new Service(idService, vehiculo, cliente, fechaService, detalleService, precio);
		} else {
			throw new ServiceFechaIncorrectaException();
		}
			
		}

																															//\nVehiculo: VW Golf modelo 2009 - Patente ABC123\
	public String mostrarResumen() {
																															//this.marcaModelo + " modelo " + this.anio + " - Patente " + this.patente;
		return "Service Nro: " + this.idService + "\nCliente: " + this.cliente.getApellido()+", "+this.cliente.getNombre()+" - "+this.cliente.getTelefono() + "\nVehiculo: " + this.vehiculo.getMarcaModelo()+" modelo "+this.vehiculo.getAnio()+" - Patente "+this.vehiculo.getPatente() + "\nTrabajo Realizado: " + this.detalleService;
	}
		
	}



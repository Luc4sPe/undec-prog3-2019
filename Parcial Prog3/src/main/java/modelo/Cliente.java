package modelo;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import excepciones.ClienteIncompletoException;
import excepciones.ClienteMenorDeEdadException;

public class Cliente {
	private Integer idCliente;
	private String apellido;
	private String nombre;
	private String documento;
	private LocalDate fechaNacimientoDate;
	private String domicilio;
	private String telefono;
	private  List<Vehiculo> vehiculos;
	
	
	
	
	

	public Cliente(Integer idCliente, String apellido, String nombre, String documento, LocalDate fechaNacimientoDate,
			String domicilio, String telefono) {
		
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimientoDate = fechaNacimientoDate;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.vehiculos = new ArrayList<Vehiculo>();
		 
	}


	public static Cliente factoryCliente(Integer idCliente, String apellido, String nombre, String documento, LocalDate fechaNacimiento,
			String domicilio, String telefono) throws ClienteIncompletoException, ClienteMenorDeEdadException{
		if( idCliente ==null||apellido==null||nombre==null||documento==null||fechaNacimiento==null||domicilio==null||telefono==null) {
			throw new ClienteIncompletoException();
		}else if (Period.between(fechaNacimiento, LocalDate.now()).getYears()>=18){
			return new Cliente(idCliente, apellido, nombre, documento, fechaNacimiento, domicilio, telefono);
		}else {
			throw new ClienteMenorDeEdadException();
		}
	}
			
		 
	


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public LocalDate getFechaNacimientoDate() {
		return fechaNacimientoDate;
	}


	public void setFechaNacimientoDate(LocalDate fechaNacimientoDate) {
		this.fechaNacimientoDate = fechaNacimientoDate;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public void asignarVehiculo(Vehiculo elVehiculo) {
		this.vehiculos.add(elVehiculo);
		
	}
	  


	public List<Vehiculo> devolverVehiculos() {
		
		return vehiculos;
	}


	

	    


	



	
}

package repositorio;

import modelo.Vehiculo;

public interface IrepositorioCrearVehiculo {

	boolean guardar(Vehiculo vehiculoNuevo);

	Vehiculo findByMatricula(String patente);
	
	

}

package interactor;

import excepciones.VehiculoIncompletoException;
import modelo.Vehiculo;
import repositorio.IrepositorioCrearVehiculo;

public class CrearVehiculoUseCase {
	IrepositorioCrearVehiculo crearVehiculo;

	public CrearVehiculoUseCase(IrepositorioCrearVehiculo crearVehiculo) {
		this.crearVehiculo = crearVehiculo;
	}
	
	

	public boolean crearVehiculo(Vehiculo vehiculoNuevo)throws VehiculoIncompletoException {
		if(existeVehiculo(vehiculoNuevo)) {
			throw new VehiculoIncompletoException();
			
		}
		else {
			return this.crearVehiculo.guardar(vehiculoNuevo);
		}
	}
	
	private boolean existeVehiculo( Vehiculo pVehiculo) {
		return this.crearVehiculo.findByMatricula(pVehiculo.getPatente())!=null;
		
	}

}

package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import Mockito.MockitoExtension;
import excepciones.VehiculoIncompletoException;
import interactor.CrearVehiculoUseCase;
import modelo.Vehiculo;
import repositorio.IrepositorioCrearVehiculo;
@ExtendWith(MockitoExtension.class)
class crearVehiculoUnitTest {

	@Mock
	IrepositorioCrearVehiculo crearVehiculoGateway;
	@Test
	public void crearVehiculo_VehiculoNoExiste_GuardaCorrectamente() throws VehiculoIncompletoException {
		Vehiculo vehiculoNuevo = Vehiculo.factoryVehiculo(1, "VW Golf", "ABC123", 2009);
		Mockito.when(crearVehiculoGateway.guardar(vehiculoNuevo)).thenReturn(true);
		CrearVehiculoUseCase crearVehiculoUseCase = new CrearVehiculoUseCase(crearVehiculoGateway);
		boolean result = crearVehiculoUseCase.crearVehiculo(vehiculoNuevo);
		Assertions.assertTrue(result);
		
	}
	
	@Test
	public void crearVehiculo_VehiculoExiste_NoGuardaCorrectamente() throws VehiculoIncompletoException {
		Vehiculo vehiculoNuevoVehiculo = Vehiculo.factoryVehiculo(1, "VW Golf", "ABC123", 2009);
		Mockito.when(crearVehiculoGateway.findByMatricula("ABC123")).thenReturn(Vehiculo.factoryVehiculo(2, "Peugeot", "ABC123", 2010));
		CrearVehiculoUseCase crearVehiculoUseCase = new CrearVehiculoUseCase(crearVehiculoGateway);
		Assertions.assertThrows(VehiculoIncompletoException.class, ()-> crearVehiculoUseCase.crearVehiculo(vehiculoNuevoVehiculo));
	}

}

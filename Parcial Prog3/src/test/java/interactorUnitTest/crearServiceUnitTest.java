package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import Mockito.MockitoExtension;
import excepciones.ClienteIncompletoException;
import excepciones.ClienteMenorDeEdadException;
import excepciones.ServiceFechaIncorrectaException;
import excepciones.ServiceIncompletoException;
import excepciones.VehiculoIncompletoException;

import interactor.CrearServiceUseCase;
import modelo.Cliente;
import modelo.Service;
import modelo.Vehiculo;
import repositorio.IrepositorioCrearService;
@ExtendWith(MockitoExtension.class)
 public class crearServiceUnitTest {
	@Mock
	IrepositorioCrearService crearServiceGateway;
	
	@Test
	public void crearService_ServiceNoExiste_GuardadoCorrectamente() throws ClienteIncompletoException, ClienteMenorDeEdadException, VehiculoIncompletoException, ServiceIncompletoException, ServiceFechaIncorrectaException {
		Cliente nueCliente = Cliente.factoryCliente(1, "Perez", "Juan", "12345678", LocalDate.of(1990, 1, 1),
				"Av. San Martin 123", "15152020");
		Vehiculo nueVehiculo = Vehiculo.factoryVehiculo(1, "VW Golf", "ABC123", 2009);
	
		Service nueService = Service.factoryService(1,nueVehiculo,nueCliente,LocalDate.of(2018, 10, 10),
				"Cambio de Aceite y Filtro", 1500.00f);
	Mockito.when(crearServiceGateway.guardar(nueService)).thenReturn(true);
	CrearServiceUseCase crearServiceUseCase = new CrearServiceUseCase(crearServiceGateway);
	boolean result= crearServiceUseCase.crearService(nueService);
	Assertions.assertTrue(result);
	
		
	}
	@Test
	public void crearService_ServiceExiste_NoSeGuardaCorrectamente() throws ClienteIncompletoException, ClienteMenorDeEdadException, VehiculoIncompletoException, ServiceIncompletoException, ServiceFechaIncorrectaException {
		Cliente nueCliente = Cliente.factoryCliente(1, "Perez", "Juan", "12345678", LocalDate.of(1990, 1, 1),
				"Av. San Martin 123", "15152020");
		Vehiculo nueVehiculo = Vehiculo.factoryVehiculo(1, "VW Golf", "ABC123", 2009);
		Service nueService = Service.factoryService(1,nueVehiculo,nueCliente,LocalDate.of(2018, 10, 10),
				"Cambio de Aceite y Filtro", 1500.00f);
		Cliente nueCliente2 = Cliente.factoryCliente(2, "Flores", "Pedro", "15345630", LocalDate.of(1995, 3, 1),
				"Av. San Martin 230", "15411420");
		Vehiculo nueVehiculo2 = Vehiculo.factoryVehiculo(2, "Peugeot", "CBA567", 2010);
		Mockito.when(crearServiceGateway.findByIdService(1)).thenReturn(Service.factoryService(1,nueVehiculo2,nueCliente2,LocalDate.of(2018, 10, 10),
				"Cambio de Aceite y Filtro", 1500.00f));
		CrearServiceUseCase crearServiceUseCase = new CrearServiceUseCase(crearServiceGateway);
		Assertions.assertThrows(ServiceIncompletoException.class, ()-> crearServiceUseCase.crearService(nueService) );
	}

	

	
	
}

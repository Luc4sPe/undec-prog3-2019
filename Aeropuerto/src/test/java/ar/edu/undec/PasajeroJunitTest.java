package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasajeroJunitTest {

	@Test
	public void instanciarPasejero_TodosLosAtributos_Correctos() throws ExcepcionDatosIncorrectos {
		Pasajero pasajero1 = new Pasajero(01,"27-32654678-0","Pozo","Mauricio,Jorge","15411458");
		
		assertEquals(01, pasajero1.getIdPasajero().intValue());
		assertEquals("27-32654678-0", pasajero1.getCuil());
		assertEquals("Pozo", pasajero1.getApellido());
		assertEquals("Mauricio,Jorge",pasajero1.getNombres());
		assertEquals("15411458", pasajero1.getTelefono());
		
				
	}
	@Test
	public void instanciarPasejero_TodosLosAtributos_Incorrectos() throws ExcepcionDatosIncorrectos {
		Pasajero pasajero1 = new Pasajero(01,"27-32654678-0","Pozo","Mauricio,Jorge","15411458");
		
		assertNotEquals(07, pasajero1.getIdPasajero().intValue());
		assertNotEquals("27-45154698-0", pasajero1.getCuil());
		assertNotEquals("Peña", pasajero1.getApellido());
		assertNotEquals("Lucas,Alfredo",pasajero1.getNombres());
		assertNotEquals("15522349", pasajero1.getTelefono());
		
				
	}

}

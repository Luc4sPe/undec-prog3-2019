package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsignacionJunitTest {

	@Test
	public void instanciarAsignacion_TodosLosAtributos_Correctos() throws ExcepcionDatosIncorrectos {
		Pasajero pasajero1 = new Pasajero(01, "27-23654678-0", "Peña", "Lucio,Daniel", "15454356");
		Asiento asiento1 = new Asiento(05, "65");
		Asignacion asignacion1= new Asignacion(pasajero1,asiento1,"004");
		
		assertEquals(pasajero1, asignacion1.getPasajero());
		assertEquals(asiento1, asignacion1.getAsiento() );
		assertEquals("004", asignacion1.getCodigoAsignacion());
		
		
	}
	@Test
	public void instanciarAsignacion_TodosLosAtributos_Incorrectos() throws ExcepcionDatosIncorrectos {
		Pasajero pasajero1 = new Pasajero(01, "27-23654678-0", "Peña", "Lucio,Daniel", "15454356");
		Pasajero pasajero2 = new Pasajero(04, "27-21654098-0", "Paez", "Leo,Jose", "15497565");
		Asiento asiento1 = new Asiento(05, "65");
		Asiento asiento2 = new Asiento(04, "15");
		Asignacion asignacion1= new Asignacion(pasajero1,asiento1,"004");
		
		assertNotEquals(pasajero2, asignacion1.getPasajero());
		assertNotEquals(asiento2, asignacion1.getAsiento() );
		assertNotEquals("010", asignacion1.getCodigoAsignacion());
		
		
	}
}

package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsientoJunitTest {

	@Test
	public void instanciarAsiento_TodosLosAtributos_Correctos() {
		Asiento asiento1 = new Asiento(01,"58");
		
		assertEquals(01, asiento1.getIdAsiento().intValue());
		assertEquals("58", asiento1.getNumeroAsiento());
	}
	
	@Test
	public void instanciarAsiento_TodosLosAtributos_Incorrecto() {
		Asiento asiento1 = new Asiento(01,"58");
		
		assertNotEquals(05, asiento1.getIdAsiento().intValue());
		assertNotEquals("85", asiento1.getNumeroAsiento());
	}
}

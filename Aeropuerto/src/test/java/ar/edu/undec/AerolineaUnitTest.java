package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AerolineaUnitTest {

	@Test
	public void instanciarAerolinea_TodosLosAtributos_Correctos() {
		Aerolinea aerolinea1 = new Aerolinea(01,"Rosario"); 
		
		assertEquals(01,aerolinea1.getIdAerolinea().intValue());
		assertEquals("Rosario", aerolinea1.getNombre());
		
	}

}

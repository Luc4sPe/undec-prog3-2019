package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class CiudadJunitTest {

	@Test
	public void instanciarCiudad_TodosLosAtributos_Correctos() {
		Ciudad ciudad1=new Ciudad(01,"Cordoba","5437");
		
		assertEquals(01, ciudad1.getIdCiudad().intValue());
		assertEquals("Cordoba", ciudad1.getNombre());
	}
	@Test
	public void instanciarCiudad_TodosLosAtributos_Incorrecto() {
		Ciudad ciudad1=new Ciudad(01,"Cordoba","5437");
		
		assertNotEquals(03, ciudad1.getIdCiudad().intValue());
		assertNotEquals("Rioja", ciudad1.getNombre());
	}
}

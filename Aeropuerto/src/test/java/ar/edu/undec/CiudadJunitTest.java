package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class CiudadJunitTest {

	@Test
	public void instanciarCiudad_TodosLosAtributos_Correctos() throws ExcepcionDatosIncorrectos {
		Ciudad ciudad1=new Ciudad(01,"Cordoba","5437");
		
		assertEquals(01, ciudad1.getIdCiudad().intValue());
		assertEquals("Cordoba", ciudad1.getNombre());
		assertEquals("5437", ciudad1.getCodigoPostal());
	}
	@Test
	public void instanciarCiudad_TodosLosAtributos_Incorrecto() throws ExcepcionDatosIncorrectos {
		Ciudad ciudad1=new Ciudad(01,"Cordoba","5437");
		
		assertNotEquals(03, ciudad1.getIdCiudad().intValue());
		assertNotEquals("Rioja", ciudad1.getNombre());
		assertNotEquals("5373", ciudad1.getCodigoPostal());
	}
}

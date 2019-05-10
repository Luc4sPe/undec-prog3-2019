package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AeropuertoJunitTest {

	@Test
	public void instanciarAeropuerto_TodosLosAtributos_Correctos() {
		Ciudad ciudad1 = new Ciudad(01, "cordoba", "5437");
		Aeropuerto aeropuerto1 = new Aeropuerto(01,"aerolineas",ciudad1,"001");		
		assertEquals(01, aeropuerto1.getIdAeropuerto().intValue());
		assertEquals("aerolineas", aeropuerto1.getNombre());
		assertEquals(ciudad1, aeropuerto1.getCuidad());
		assertEquals("001",aeropuerto1.getCodigo() );
	}
	
	@Test
	public void instanciarAeropuerto_TodosLosAtributos_Incorrectos() {
		Ciudad ciudad1 = new Ciudad(01, "cordoba", "5437");
		Ciudad ciudad2 = new Ciudad(02, "rioja", "5459");
		Aeropuerto aeropuerto1 = new Aeropuerto(01,"aerolineas",ciudad1,"001");		
		assertNotEquals(04, aeropuerto1.getIdAeropuerto().intValue());
		assertNotEquals("rioja", aeropuerto1.getNombre());
		assertNotEquals(ciudad2, aeropuerto1.getCuidad());
		assertNotEquals("004",aeropuerto1.getCodigo() );
	}

}

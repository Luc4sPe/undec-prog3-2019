package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestorPasajerosJunitTest {
	
	 GestorPasajeros gestorPasajeros = new GestorPasajeros();
	
	@Test
	public void registrarPasajero_TodosLosAtribiutos_CuilCorrecto() throws ExcepcionDatosIncorrectos {
		assertTrue(gestorPasajeros.registrarPasajero("25-23302555-7", "Pozo", "Leonardo Nicolas", "3825416602"));
	}
	
	@Test
	public void registrarPasajero_TodosLosAtributos_CuilCampoVacio() throws ExcepcionDatosIncorrectos {
		assertFalse(gestorPasajeros.registrarPasajero("", "Perez", "Nicolas", "+3825415608"));
	}
	
	@Test
	public void registrarPasajero_TodosLosAtributos_CuilExistente() throws ExcepcionDatosIncorrectos {
		gestorPasajeros.registrarPasajero("25-23302555-7", "Pozo", "Leonardo Nicolas", "3825416602");
		assertFalse(gestorPasajeros.registrarPasajero("25-23302555-7", "Pozo", "Leonardo Nicolas", "3825416602"));
	}
	
	@Test
	public void consultarPasajeroCuilCorrecto() throws ExcepcionDatosIncorrectos {
		assertTrue(gestorPasajeros.registrarPasajero("25-23302555-7", "Zalazar", "Luis Nicolas", "3825416602"));
		Pasajero verificar  = gestorPasajeros.consultarPasajeroPorCuil("25-23302555-7");
		assertEquals(1, verificar.getIdPasajero().intValue());
		assertEquals("25-23302555-7", verificar.getCuil());
		assertEquals("Zalazar", verificar.getApellido());
		assertEquals("Luis Nicolas", verificar.getNombres());
		assertEquals("3825416602", verificar.getTelefono());
	}
	

	@Test
	public void consultarPasajeroCuilIncorrecto() throws ExcepcionDatosIncorrectos {
		assertTrue(gestorPasajeros.registrarPasajero("25-23302555-7", "Zalazar", "Kevin Pablo", "3825416602"));
		Pasajero verificar  = gestorPasajeros.consultarPasajeroPorCuil("23-23302555-7");
		assertFalse(gestorPasajeros.existenciaPasajero(verificar.getCuil()));
		
	}
	
	@Test
	public void eliminarPasajero_PasajeroExistente_CuilCorrecto() throws ExcepcionDatosIncorrectos {

		//Consulta en la lista si un pasajero existe a travez del cuil, y lo elimina de la lista
		assertTrue(gestorPasajeros.registrarPasajero("20-32458305-0", "Vega", "Jose Nicolas", "3825416602"));
		assertTrue(gestorPasajeros.borrarPasajero("20-32458305-0"));
	}
	
	@Test
	public void eliminarPasajero_PasajeroExistente_CuilIncorrecto() throws ExcepcionDatosIncorrectos {
		//Consulta en la lista si un pasajero existe a travez de su cuil, devuelve false si no lo encontra
		assertTrue(gestorPasajeros.registrarPasajero("20-32458305-0", "Vega", "Jose Nicolas", "3825416602"));
		assertFalse(gestorPasajeros.borrarPasajero("28-23302555-7"));
	}
	
	@Test
	public void ModificarPasajero_NombreTelefono_CuilCorrecto() throws ExcepcionDatosIncorrectos{
		//Consulta en la lista un pasajero y modifica sus campos de nombre y telefono, atra ves del cuil
		assertTrue(gestorPasajeros.registrarPasajero("20-32458305-0", "Vega", "Jose Nicolas", "3825416602"));
		assertTrue(gestorPasajeros.modificarPasajero("20-32458305-0", "Kevin Manuel", "+5493825434455"));
	}
	

}

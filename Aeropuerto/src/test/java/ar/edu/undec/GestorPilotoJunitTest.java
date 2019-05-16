package ar.edu.undec;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GestorPilotoJunitTest {
	
	GestorPiloto gestorPiloto =new GestorPiloto();

	@Test
	public void registrarPiloto_TodosLosAtribiutos_DNICorrecto() throws ExcepcionDatosIncorrectos {
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		assertTrue(gestorPiloto.registrarPiloto("Vega", "Raúl", "32.458.305", fechaNacimiento));
	}
	
	@Test
	public void registrarPiloto_TodosLosAtributos_DNICampoVacio() throws ExcepcionDatosIncorrectos {
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		assertFalse(gestorPiloto.registrarPiloto("Vega", "Raúl", "", fechaNacimiento));
	}
	
	@Test
	public void registrarPasajero_TodosLosAtributos_DNIExistente() throws ExcepcionDatosIncorrectos {

		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		gestorPiloto.registrarPiloto("Vega", "Raúl", "32.458.305", fechaNacimiento);
		assertFalse(gestorPiloto.registrarPiloto("Vega", "Raúl", "32.458.305", fechaNacimiento));
	}
	
	@Test
	public void BuscarPiloto_DNICorrecto() throws ExcepcionDatosIncorrectos {
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		assertTrue(gestorPiloto.registrarPiloto("Vega", "Raúl", "32.458.305", fechaNacimiento));
		Piloto verificar  = gestorPiloto.buscarPilotoPorDNI("32.458.305");
		assertEquals(1, verificar.getIdPiloto().intValue());
		assertEquals("Vega", verificar.getApellido());
		assertEquals("Raúl", verificar.getNombre());
		assertEquals("32.458.305", verificar.getDocumento());
		assertEquals( fechaNacimiento, verificar.getFechaNacimiento());
	}	
	
	@Test
	public void BuscarPiloto_DNI_Incorrecto() throws ExcepcionDatosIncorrectos {
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		assertTrue(gestorPiloto.registrarPiloto("Vega", "Raúl", "32.458.305", fechaNacimiento));
		Piloto verificar = gestorPiloto.buscarPilotoPorDNI("30.654.378") ;
		assertFalse(gestorPiloto.existenciaPiloto(verificar.getDocumento()));
		
		
	}

	@Test
	public void BorrarPiloto_DNICorrecto() throws ExcepcionDatosIncorrectos {

		//Consulta en la lista si un piloto existe a travez del documento, y lo elimina de la lista
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		assertTrue(gestorPiloto.registrarPiloto("Vega", "Raúl", "32.458.305", fechaNacimiento));
		assertTrue(gestorPiloto.borrarPiloto("32.458.305"));
		
	}
	
	@Test
	public void BorrarPiloto_PilotoExistente_DNI_Incorrecto() throws ExcepcionDatosIncorrectos {
		//Consulta en la lista si un Piloto existe a travez de su Cocumento, devuelve false si no lo encontra
		
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		assertTrue(gestorPiloto.registrarPiloto("Vega", "Raúl", "32.458.305", fechaNacimiento));
		assertFalse(gestorPiloto.borrarPiloto("35.098.678"));
		
	}
	
	@Test
	public void ModificarPiloto_Apellido_NombreApellido_fechaNaciemito_DNI_Correcto() throws ExcepcionDatosIncorrectos{
		//Consulta en la lista un piloto y modifica sus campos Apellido, Nombre y fecha de Nacimiento,  atra ves del DNI
		
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		assertTrue(gestorPiloto.registrarPiloto("Vega", "Raúl", "32.458.305", fechaNacimiento));
		LocalDate fechaNacimiento1 = LocalDate.of(1985, 03, 3);
		assertTrue(gestorPiloto.modificarPiloto("32.458.305", "Peña", "Lucas", fechaNacimiento1));
		
	}
	

}

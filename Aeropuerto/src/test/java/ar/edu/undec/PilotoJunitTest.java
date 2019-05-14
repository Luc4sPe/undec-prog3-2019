package ar.edu.undec;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class PilotoJunitTest {

	@Test
	public void instanciarPilotoTodo_losAtibutos_correctos() {
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		Piloto nuevo =new Piloto(01,"Perez","Julian","34.456.678", fechaNacimiento);
	
		
		assertEquals(01, nuevo.getIdPiloto().intValue());
		assertEquals("Perez", nuevo.getApellido());
		assertEquals("Julian", nuevo.getNombre());
		assertEquals("34.456.678", nuevo.getDocumento());
		assertEquals(fechaNacimiento, nuevo.getFechaNacimiento());
		
		
	}
	@Test
	public void instanciarPilotoTodo_losAtibutos_Incorrectos() {
		LocalDate fechaNacimiento = LocalDate.of(1986, 05, 13);
		LocalDate fechaNaciemiento1 = LocalDate.of(1987, 03, 03);
		Piloto nuevo =new Piloto(01,"Perez","Julian","34.456.678", fechaNacimiento);
	
		
		assertNotEquals(03, nuevo.getIdPiloto().intValue());
		assertNotEquals("Peña", nuevo.getApellido());
		assertNotEquals("Lucas", nuevo.getNombre());
		assertNotEquals("30.234.034", nuevo.getDocumento());
		assertNotEquals(fechaNaciemiento1, nuevo.getFechaNacimiento());
		
		
	}
}

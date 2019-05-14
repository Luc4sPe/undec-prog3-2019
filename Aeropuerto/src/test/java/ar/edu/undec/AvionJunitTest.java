package ar.edu.undec;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AvionJunitTest {

	@Test
	public void instanciarAvion_TodosLosAtributos_Correctos() {
		
		List<Asiento> asiento = new ArrayList<Asiento>();
		for (int i=0; i<3;i++) {
			Asiento asiento1 = new Asiento(i,"C"+i);
			asiento.add(asiento1);
		}
		Avion avion = new Avion(01,"Boeing 747","MSVB3546",asiento);
		assertEquals(01,avion.getIdAvion().intValue());
		assertEquals("Boeing 747", avion.getModelo());
		assertEquals("MSVB3546", avion.getMatricula());
		assertEquals(asiento, avion.getAsientos());
		
	}
	@Test
	public void instanciarAvion_TodosLosAtributos_Incorrectos() {
		
		List<Asiento> asiento = new ArrayList<Asiento>();
		List<Asiento> asiento2 = new ArrayList<Asiento>();
		for (int i=0; i<3;i++) {
			Asiento asiento1 = new Asiento(i,"C"+i);
			asiento.add(asiento1);
			Asiento asiento3 = new Asiento(i,"A"+i);
			asiento2.add(asiento3);
		}
		Avion avion = new Avion(01,"Boeing 747","MSVB3546",asiento);
		assertNotEquals(06,avion.getIdAvion().intValue());
		assertNotEquals("Airbus A320", avion.getModelo());
		assertNotEquals("VBN9028", avion.getMatricula());
		assertNotEquals(asiento2, avion.getAsientos());
		
	}

}

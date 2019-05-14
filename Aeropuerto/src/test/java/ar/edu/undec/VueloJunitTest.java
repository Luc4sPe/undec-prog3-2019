package ar.edu.undec;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class VueloJunitTest {

	@Test
	public void intasnciarVuelosTodosLosAtributosCorrectos() throws ExcepcionDatosIncorrectos {
		
		Ciudad ciudadSalida = new Ciudad(1, "Cordoba", "5437");
		Aeropuerto salidaAeropuerto =new Aeropuerto(1, "AeropuertoInternacionalEzeiza", ciudadSalida, "003");
		LocalDateTime fechaHoraSalida =  LocalDateTime.of(2019,05,13, 8,30);
		Ciudad ciudadArribo = new Ciudad(1, "Rio Negro", "5437");
		Aeropuerto arriboAeropuerto = new Aeropuerto(1, "Aeropuerto de El Bolson", ciudadArribo, "005");
		LocalDateTime fechaHoraArribo =  LocalDateTime.of(2019,05,13, 22,30);
		Aerolinea aerolinea = new Aerolinea(1, "AerolineasArgentina");
		
		//se agrega pilotos a la lista
		List<Piloto> pilotos = new ArrayList<Piloto>();
		LocalDate fecha = LocalDate.of(1987,03,25);
		LocalDate fecha1 = LocalDate.of(1989,04,10);
		Piloto piloto1 = new Piloto(1, "Peña", "Lucas", "32.458.305",fecha );
		Piloto piloto2 = new Piloto(2, "Paez", "Daniel", "30.637.309",fecha1 );
		pilotos.add(piloto1);
		pilotos.add(piloto2);
		
		// se crea la asignacion
		List<Asignacion> pasajero = new ArrayList<Asignacion>();
		Pasajero pasajero1 = new Pasajero(1, "20-33.345.567-0", "Barboza", "Luis", "15654734");
		Pasajero pasajero2 = new Pasajero(2, "20-40.398.123-0", "Codocea", "Carlos", "15415458");
		Asiento asiento1 =new Asiento(1, "34");
		Asiento asiento2 = new Asiento(2, "35");
		
		Asignacion asignacion1 =new Asignacion(pasajero1, asiento1, "001");
		Asignacion asignacion2 = new Asignacion(pasajero2, asiento2, "002");
		pasajero.add(asignacion1);
		pasajero.add(asignacion2);
		 
		// se agrega asiento a la lista 
		List<Asiento> listaAsiento = new ArrayList<Asiento>();
		for (int i=0; i<3;i++) {
			Asiento asientonuevo = new Asiento(i,"C"+i);
			listaAsiento.add(asientonuevo);
		}
		Avion avion =new Avion(1, "Boeing 747", "MBN124", listaAsiento);
		
		// se crea el vuelo

		Vuelo nuevo = new Vuelo("001",salidaAeropuerto,fechaHoraSalida,arriboAeropuerto,fechaHoraArribo,aerolinea,pilotos,avion,pasajero);
		
		assertEquals("001", nuevo.getCodigoVuelo());
		assertEquals(salidaAeropuerto, nuevo.getSalidAeropuerto());
		assertEquals(fechaHoraSalida, nuevo.getFechaHoraSalida());
		assertEquals(arriboAeropuerto, nuevo.getArribo());
		assertEquals(fechaHoraArribo, nuevo.getFechaHoraArribo());
		assertEquals(aerolinea, nuevo.getAerolinea());
		assertEquals(pilotos, nuevo.getPilotos());
		assertEquals(avion, nuevo.getAvion());
		assertEquals(pasajero, nuevo.getPasajero() );
		
	}
	
	@Test
	public void intasnciarVuelosTodosLosAtributos_Incorrectos() throws ExcepcionDatosIncorrectos {
		
		Ciudad ciudadSalida = new Ciudad(1, "Cordoba", "5437");
		Ciudad ciudadSalida1 = new Ciudad(3, "San Luis", "6543");
		Aeropuerto salidaAeropuerto =new Aeropuerto(1, "AeropuertoInternacionalEzeiza", ciudadSalida, "003");
		Aeropuerto salidaAeropuerto1 =new Aeropuerto(2, "AeropuertoJorgeNewbery", ciudadSalida1, "010");
		//1
		LocalDateTime fechaHoraSalida =  LocalDateTime.of(2019,05,13, 8,30);
		LocalDateTime fechaHoraSalida1 =  LocalDateTime.of(2019,06,16, 10,30);
		Ciudad ciudadArribo = new Ciudad(1, "Rio Negro", "5437");
		Ciudad ciudadArribo1 = new Ciudad(1, "Santa Cruz", "5437");
		Aeropuerto arriboAeropuerto = new Aeropuerto(1, "Aeropuerto de El Bolson", ciudadArribo, "005");
		Aeropuerto arriboAeropuerto1 = new Aeropuerto(5, "Aeropuerto Comandante Armando Tola", ciudadArribo1, "030");
		LocalDateTime fechaHoraArribo =  LocalDateTime.of(2019,05,13, 22,30);
		LocalDateTime fechaHoraArribo1 =  LocalDateTime.of(2019,05,18, 12,30);
		Aerolinea aerolinea = new Aerolinea(1, "AerolineasArgentina");
		Aerolinea aerolinea1 = new Aerolinea(7, "AndesLineasAereas");
		//se agrega pilotos a la lista
		List<Piloto> pilotos = new ArrayList<Piloto>();
		List<Piloto> pilotos1 = new ArrayList<Piloto>();
		LocalDate fecha = LocalDate.of(1987,03,25);
		LocalDate fecha1 = LocalDate.of(1989,04,10);
		LocalDate fecha2 = LocalDate.of(1990,01,19);
		LocalDate fecha3 = LocalDate.of(1992,10,25);
		Piloto piloto1 = new Piloto(1, "Peña", "Lucas", "32.458.305",fecha );
		Piloto piloto2 = new Piloto(2, "Paez", "Daniel", "30.637.309",fecha1 );
		Piloto piloto3 = new Piloto(5, "Flores", "Carlos", "35.629.903",fecha2 );
		Piloto piloto4 = new Piloto(7, "Perez", "Juan", "40.621.219",fecha3 );
		pilotos.add(piloto1);
		pilotos.add(piloto2);
		pilotos1.add(piloto3);
		pilotos1.add(piloto4);
		
		// se crea la asignacion
		List<Asignacion> pasajero = new ArrayList<Asignacion>();
		List<Asignacion> pasajeros1 = new ArrayList<Asignacion>();
		Pasajero pasajero1 = new Pasajero(1, "20-33.345.567-0", "Barboza", "Luis", "15654734");
		Pasajero pasajero2 = new Pasajero(2, "20-40.398.123-0", "Codocea", "Carlos", "15415458");
		Pasajero pasajero3 = new Pasajero(4, "20-32.323.321-0", "Valdiviezo", "Ivan", "15436798");
		Pasajero pasajero4 = new Pasajero(3, "20-35.987.456-0", "Reyna", "David", "15215355");
		Asiento asiento1 =new Asiento(1, "34");
		Asiento asiento2 = new Asiento(2, "35");
		Asiento asiento3 = new Asiento(5, "45");
		Asiento asiento4 = new Asiento(6, "05");
		
		Asignacion asignacion1 =new Asignacion(pasajero1, asiento1, "001");
		Asignacion asignacion2 = new Asignacion(pasajero2, asiento2, "005");
		Asignacion asignacion3 = new Asignacion(pasajero3, asiento3, "050");
		Asignacion asignacion4 = new Asignacion(pasajero4, asiento4, "014");
		pasajero.add(asignacion1);
		pasajero.add(asignacion2);
		pasajeros1.add(asignacion3);
		pasajeros1.add(asignacion4);
		 
		// se agrega asiento a la lista 
		List<Asiento> listaAsiento = new ArrayList<Asiento>();
		List<Asiento> listaAsiento1 = new ArrayList<Asiento>();
		for (int i=0; i<3;i++) {
			Asiento asientonuevo = new Asiento(i,"C"+i);
			Asiento asientonuevo1 = new Asiento(i,"A"+i);
			listaAsiento.add(asientonuevo);
			listaAsiento1.add(asientonuevo1);
		}
		Avion avion =new Avion(1, "Boeing 747", "MBN124", listaAsiento);
		Avion avion1 =new Avion(1, "Boeing 747", "MBN124", listaAsiento1);
		
		// se crea el vuelo

		Vuelo nuevo = new Vuelo("001",salidaAeropuerto,fechaHoraSalida,arriboAeropuerto,fechaHoraArribo,aerolinea,pilotos,avion,pasajero);
		
		assertNotEquals("003", nuevo.getCodigoVuelo());
		assertNotEquals(salidaAeropuerto1, nuevo.getSalidAeropuerto());
		assertNotEquals(fechaHoraSalida1, nuevo.getFechaHoraSalida());
		assertNotEquals(arriboAeropuerto1, nuevo.getArribo());
		assertNotEquals(fechaHoraArribo1, nuevo.getFechaHoraArribo());
		assertNotEquals(aerolinea1, nuevo.getAerolinea());
		assertNotEquals(pilotos1, nuevo.getPilotos());
		assertNotEquals(avion1, nuevo.getAvion());
		assertNotEquals(pasajeros1, nuevo.getPasajero() );
		
	}

}

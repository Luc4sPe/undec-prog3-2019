package ar.edu.undec;

import static org.junit.Assert.*;



import org.junit.Test;

public class GestorUbucacionJunitTest {
	
	GestorUbicacion  gestor =  new GestorUbicacion(); 
	 
	
	@Test
	public void registrarCiudad_TodosLosAtribiutos_CodigoPostalCorrecto() throws ExcepcionDatosIncorrectos {
		
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
	}
	
	@Test
	public void registrarCiudad_TodosLosAtributos_NombreCampoVacio() throws ExcepcionDatosIncorrectos {
		
		assertFalse(gestor.registrarCiudad("", "5000"));
	}
	@Test
	public void registrarCiudad_TodosLosAtributos_Nombre_CodigoPostalCampoVacio() throws ExcepcionDatosIncorrectos {
		
		assertFalse(gestor.registrarCiudad("", " "));
	}
	
	@Test
	public void registrarCiudad_TodosLosAtributos_CodigoPostalCampoVacio() throws ExcepcionDatosIncorrectos {
		
		assertFalse(gestor.registrarCiudad("Cordoba", ""));
	}
	
	@Test
	public void registrarCiudad_TodosLosAtributos_CodigoPostalExistente() throws ExcepcionDatosIncorrectos {

		gestor.registrarCiudad("Coordoba", "5000");
		assertFalse(gestor.registrarCiudad("Cordoba", "5000"));
	}
	
	@Test
	public void BuscarCiudad_CodigoPostalCorrecto() throws ExcepcionDatosIncorrectos {
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		Ciudad consultar = gestor.BuscarCiudadPorCodigoPostal("5000") ;
		assertEquals(1, consultar.getIdCiudad().intValue());
		assertEquals("Cordoba", consultar.getNombre());
		assertEquals("5000", consultar.getCodigoPostal());
		
	}	
	
	@Test
	public void BuscarCiudad_CodigoPostal_Incorrecto() throws ExcepcionDatosIncorrectos {
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		Ciudad consultar = gestor.buscarCiudadCodigoPostal("5235");	
		assertFalse(gestor.existenciaCiudad(consultar.getCodigoPostal()));
			
		
	}
	
	@Test
	public void BorrarCiudad_CodigoPostalCorrecto() throws ExcepcionDatosIncorrectos {

		//Consulta en la lista si un ciudad existe a travez del codigoPostal, y lo elimina de la lista
		
		
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		assertTrue(gestor.borrarCiudad("5000"));
		
	}

	@Test
	public void BorrarCiudad_CiudadExistente_CodigoPostal_Incorrecto() throws ExcepcionDatosIncorrectos {
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		assertFalse(gestor.borrarCiudad("5678"));
		
		
	}
	
	@Test
	public void ActualizarCiudad_Nombre__codigoPosta_Correcto() throws ExcepcionDatosIncorrectos{
		//Consulta en la lista un ciudad y modifica su Nombre,  atra ves del codigoPostal
		
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		assertTrue(gestor.actualizarCiudad("5000", "Rioja"));
		
		
	}
	
	@Test
	public void ActualizarCiudad_Nombre__codigoPosta_Iorrecto() throws ExcepcionDatosIncorrectos{
		//Consulta en la lista un ciudad y modifica su Nombre,  atra ves del codigoPostal
		
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		assertFalse(gestor.actualizarCiudad("5010", "Rioja"));
		
		
	}
	
	@Test
	public void registrarAeropuerto_TodosLosAtributosCorrectos() throws ExcepcionDatosIncorrectos {
		
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		Ciudad dato = gestor.buscarCiudadCodigoPostal("5000");
		assertTrue(gestor.registrarAeropuerto("Aerolineas Argentinas", dato, "45G23GF"));
	}
	
	@Test
	public void registrarAeropuerto_TodosLosAtributos_CodigoCAmpoVacio() throws ExcepcionDatosIncorrectos {
		
		
		
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		Ciudad dato = gestor.buscarCiudadCodigoPostal("5000");
		assertFalse(gestor.registrarAeropuerto("Aerolineas Argentinas", dato, ""));
	}
	
	@Test
	public void buscarAeropuerto_Nombre_Correcto() throws ExcepcionDatosIncorrectos {
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		Ciudad dato = gestor.buscarCiudadCodigoPostal("5000");
		assertTrue(gestor.registrarAeropuerto("Aerolineas Argentinas", dato, "45G23GF"));
		assertTrue(gestor.existenciaAeropuerto("45G23GF"));	
		
	}
	@Test
	public void consultarAeropuerto_EnviarNombre_NegarExistencia() {
		assertFalse(gestor.existenciaAeropuerto("45G23GF"));
		
	}
	
	@Test
	public void BorrarAeropuerto_Codigo_Correcto() throws ExcepcionDatosIncorrectos {
		
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		Ciudad dato = gestor.buscarCiudadCodigoPostal("5000");
		assertTrue(gestor.registrarAeropuerto("Aerolineas Argentinas", dato, "45G23GF"));
		assertTrue(gestor.borrarAeropuerto("45G23GF"));
			
	}
	
	@Test
	public void BorrarAeropuerto_Codigo_Incorrecto() throws ExcepcionDatosIncorrectos {
		
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		Ciudad dato = gestor.buscarCiudadCodigoPostal("5000");
		assertTrue(gestor.registrarAeropuerto("Aerolineas Argentinas", dato, "45G23GF"));
		assertFalse(gestor.borrarAeropuerto("50G29GF"));
		
	}
	
	
	@Test
	public void actualizarAeropuerto_NombreCodigo_Incorrecto() throws ExcepcionDatosIncorrectos {
		assertTrue(gestor.registrarCiudad("Cordoba", "5000"));
		Ciudad dato = gestor.buscarCiudadCodigoPostal("5000");
		assertTrue(gestor.registrarAeropuerto("Aerolineas Argentinas", dato, "45G23GF"));
		assertFalse(gestor.actualizarAeropuerto("50G29GF"," American Andes"));
		
		
		
	}
	
	
	
	
	
}

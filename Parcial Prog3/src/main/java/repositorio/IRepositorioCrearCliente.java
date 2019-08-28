package repositorio;

import modelo.Cliente;

public interface IRepositorioCrearCliente {
	boolean guardar(Cliente uncliente );
	Cliente verificacionDNI(String aNumeroDocumento);
}

package interactor;

import excepciones.ClienteExisteException;
import modelo.Cliente;
import repositorio.IRepositorioCrearCliente;

public class CrearClienteUseCase {
	private IRepositorioCrearCliente crearCliente;

	public CrearClienteUseCase(IRepositorioCrearCliente crearCliente) {
		this.crearCliente = crearCliente;
	}

	public boolean crearCliente(Cliente clienteNuevo) throws ClienteExisteException {
		if(existeCliente(clienteNuevo)) {
			throw new ClienteExisteException();
		}else {
			return this.crearCliente.guardar(clienteNuevo);
		}
		
	}

	private boolean existeCliente(Cliente pCliente) {
		return this.crearCliente.findByDNI(pCliente.getDocumento())!=null;
	}
	
}

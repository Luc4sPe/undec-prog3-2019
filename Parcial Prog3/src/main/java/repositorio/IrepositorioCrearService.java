package repositorio;

import modelo.Service;

public interface IrepositorioCrearService {

	boolean guardar(Service nueService);

	Service findByIdService(Integer idService);


}

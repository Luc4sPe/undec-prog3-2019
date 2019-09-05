package interactor;

import excepciones.ServiceIncompletoException;
import modelo.Service;
import repositorio.IrepositorioCrearService;

public class CrearServiceUseCase {

	IrepositorioCrearService crearnueCrearService;
	

	
	public CrearServiceUseCase(IrepositorioCrearService crearnueCrearService) {
		
		this.crearnueCrearService = crearnueCrearService;
	}
	public boolean crearService(Service nueService) throws ServiceIncompletoException{
		if(existeService(nueService)) {
			throw new ServiceIncompletoException("El serviceya existe");
		}
		else {
			return this.crearnueCrearService.guardar(nueService);
		}
	}
	private boolean existeService(Service nueService) {
		return this.crearnueCrearService.findByIdService(nueService.getIdService())!=null;	}
}

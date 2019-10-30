package Interactor;

import Exceptions.EquipoExisteException;
import Model.Equipo;
import Repositorio.IRepositorioCrearEquipo;

public class CrearEquipoUseCase {
    private IRepositorioCrearEquipo crearEquipoGateway;
    public CrearEquipoUseCase(IRepositorioCrearEquipo crearEquipoGateway) {
        this.crearEquipoGateway=crearEquipoGateway;
    }

    public boolean crearEquipo(Equipo equipoNuevo) throws EquipoExisteException {
        if(crearEquipoGateway.findByNombre(equipoNuevo.getNombre())==null){
            return this.crearEquipoGateway.guardar(equipoNuevo);

        }else throw new EquipoExisteException();
    }
}

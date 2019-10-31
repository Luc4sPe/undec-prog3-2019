package Interactor;

import Exceptions.JugadorExisteException;
import Model.Jugador;
import Repositorio.IRepositorioCrearJugador;
import Repositorio.IRepositorioModificarJugador;

public class ModificarJugadorUseCase {
    private IRepositorioModificarJugador iRepositorioModificarJugador;
    public ModificarJugadorUseCase(IRepositorioModificarJugador iRepositorioModificarJugador) {
        this.iRepositorioModificarJugador=iRepositorioModificarJugador;
    }

    public boolean modificarJugador(Jugador messiDatosNuevos) throws JugadorExisteException {

        if(iRepositorioModificarJugador.findByDNI(messiDatosNuevos.getDocumento())!=null)
            throw new JugadorExisteException();
        return this.iRepositorioModificarJugador.actualizar(messiDatosNuevos);
    }
}

package Interactor;

import Exceptions.JugadorExisteException;
import Model.Jugador;
import Repositorio.IRepositorioCrearJugador;
import Repositorio.IRepositorioModificarJugador;

public class ModificarJugadorUseCase {
    private IRepositorioCrearJugador iRepositorioModificarJugador;
    public ModificarJugadorUseCase(IRepositorioModificarJugador iRepositorioModificarJugador) {
    }

    public boolean modificarJugador(Jugador messiDatosNuevos) throws JugadorExisteException {
        if(iRepositorioModificarJugador.findByDocumento(messiDatosNuevos.getDocumento())!=null){

        }
    }
}

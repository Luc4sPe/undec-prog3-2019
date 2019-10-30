package Interactor;

import Exceptions.JugadorExisteException;
import Model.Jugador;
import Repositorio.IRepositorioCrearJugador;

public class CrearJugadorUseCase {
    private IRepositorioCrearJugador crearJugadorGateway;
    public CrearJugadorUseCase(IRepositorioCrearJugador crearJugadorGateway) {
        this.crearJugadorGateway=crearJugadorGateway;
    }

    public boolean crearJugador(Jugador elJugador) throws JugadorExisteException {
        if(crearJugadorGateway.findByDocumento(elJugador.getDocumento())==null){
            return this.crearJugadorGateway.guardar(elJugador);
        }else throw new JugadorExisteException();
    }
}

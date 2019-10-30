package Model;



import Exceptions.EquipoIncompletoException;

import java.util.ArrayList;
import java.util.Collection;

public class Equipo {

    private Integer idEquipo;
    private String nombre;
    private Collection<Jugador> jugadores;

    private Equipo(Integer idEquipo,String nombre, ArrayList<Jugador>jugadores){
        this.idEquipo=idEquipo;
        this.nombre=nombre;
        this.jugadores=jugadores;
        this.jugadores=jugadores;

    }
    public static Equipo instancia(Integer idEquipo, String nombre, ArrayList<Jugador> jugadors) throws EquipoIncompletoException {
        if(nombre==null||nombre.length()==0){
            throw new EquipoIncompletoException();
        }else return new Equipo(idEquipo,nombre,jugadors);
    }

    public String getNombre() {
        return nombre;
    }

    public boolean asignarJugador(Jugador messi) {

        this.jugadores.add(messi);
        return false;
    }


}

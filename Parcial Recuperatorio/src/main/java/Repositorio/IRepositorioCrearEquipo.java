package Repositorio;

import Model.Equipo;

public interface IRepositorioCrearEquipo {
    Equipo findByNombre(String barcelona);

    boolean guardar(Equipo equipoNuevo);
}

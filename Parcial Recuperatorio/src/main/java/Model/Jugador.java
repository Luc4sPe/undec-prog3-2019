package Model;

import Exceptions.JugadorIncompletoException;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {


    private Integer idJugador;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double estatura;
    private String documento;

    private Jugador (Integer idJugador,String nombre,LocalDate fechaNacimiento,double estatura,String documento){
        this.idJugador=idJugador;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.estatura=estatura;
        this.documento=documento;
    }
    public static Jugador instancia(Integer idJugador, String nombre, LocalDate fechaNacimiento, double estatura, String documento) throws JugadorIncompletoException {
        if(nombre==null||fechaNacimiento==null||documento==null){
            throw new JugadorIncompletoException();

        }else return new Jugador(idJugador,nombre,fechaNacimiento,estatura,documento);
    }

    public String getDocumento() {
        return documento;
    }

    public Integer getEdad(){
        return Period.between(fechaNacimiento,LocalDate.now()).getYears();
    }
    public double getEstatura() {
        return estatura;
    }
}

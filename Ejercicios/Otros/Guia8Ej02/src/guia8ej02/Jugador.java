
package guia8ej02;

import java.util.Objects;


public class Jugador {
    
    private Integer idJugador; //1 al 6
    private String nombre;
    private Boolean mojado; 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idJugador;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + (this.mojado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.idJugador != other.idJugador) {
            return false;
        }
        if (this.mojado != other.mojado) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "idJugador: " + idJugador + ", nombre: " + nombre + ", mojado: " + mojado;
    }

    public Jugador() {
    }

    public Jugador(Integer idJugador, String nombre, boolean mojado) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }
    
    
}

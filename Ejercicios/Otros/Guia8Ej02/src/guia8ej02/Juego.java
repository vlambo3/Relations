
package guia8ej02;


import java.util.ArrayList;
import java.util.Objects;



public class Juego {
    private ArrayList <Jugador> jugadores = new ArrayList();
    private Revolver revolver;

    public Juego() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.jugadores);
        hash = 97 * hash + Objects.hashCode(this.revolver);
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
        final Juego other = (Juego) obj;
        if (!Objects.equals(this.jugadores, other.jugadores)) {
            return false;
        }
        if (!Objects.equals(this.revolver, other.revolver)) {
            return false;
        }
        return true;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

  

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }


    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego - Jugadores: " + jugadores + "\nRevolver: " + revolver;
    }
    
    
}

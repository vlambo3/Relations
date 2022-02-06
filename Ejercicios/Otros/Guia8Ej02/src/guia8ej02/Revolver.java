
package guia8ej02;

public class Revolver {
    private Integer  posActual;  //puede que este el agua o no
    private Integer posTamborAgua; //posicion donde se encuentra el agua

    Revolver() {
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public int getPosTamborAgua() {
        return posTamborAgua;
    }

    public void setPosTamborAgua(Integer posTamborAgua) {
        this.posTamborAgua = posTamborAgua;
    }   
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.posActual;
        hash = 29 * hash + this.posTamborAgua;
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
        final Revolver other = (Revolver) obj;
        if (this.posActual != other.posActual) {
            return false;
        }
        if (this.posTamborAgua != other.posTamborAgua) {
            return false;
        }
        return true;
    }

    public void setPosTamborAgua(int posTamborAgua) {
        this.posTamborAgua = posTamborAgua;
    }

    public Revolver(Integer posActual, Integer posTamborAgua) {
        this.posActual = posActual;
        this.posTamborAgua = posTamborAgua;
    }

   
   

    @Override
    public String toString() {
        return "Revolver: Posicion Actual: " + posActual + ", Posicion Agua: " + posTamborAgua;
    }
    
    
}

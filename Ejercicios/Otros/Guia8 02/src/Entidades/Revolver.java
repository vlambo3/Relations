package Entidades;

public class Revolver {

    private Integer posAct;

    private Integer posAwa;

    public Revolver() {
    }

    public Revolver(Integer posAct, Integer posAwa) {
        this.posAct = posAct;
        this.posAwa = posAwa;
    }

    public Integer getPosAct() {
        return posAct;
    }

    public void setPosAct(Integer posAct) {
        this.posAct = posAct;
    }

    public Integer getPosAwa() {
        return posAwa;
    }

    public void setPosAwa(Integer posAwa) {
        this.posAwa = posAwa;
    }

}



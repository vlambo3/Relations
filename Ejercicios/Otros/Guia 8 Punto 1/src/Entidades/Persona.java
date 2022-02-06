package Entidades;



public class Persona {

    private String nombree;
    private String apellido;
    private Integer edadd;
    private Integer documento;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombree, String apellido, Integer edadd, Integer documento, Perro mascota) {
        this.nombree = nombree;
        this.apellido = apellido;
        this.edadd = edadd;
        this.documento = documento;
        this.mascota = mascota;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdadd() {
        return edadd;
    }

    public void setEdadd(Integer edadd) {
        this.edadd = edadd;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    
    public static void mostrar(Persona p){
        System.out.println(p.toString());
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombree=" + nombree + ", apellido=" + apellido + ", edadd=" + edadd + ", documento=" + documento + "\n, mascota=" + mascota + '}';
    }

}

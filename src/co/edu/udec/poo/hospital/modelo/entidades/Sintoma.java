package co.edu.udec.poo.hospital.modelo.entidades;

/**
 *
 * @author Erick
 */
public class Sintoma {

    private String descripcion;

    public Sintoma(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
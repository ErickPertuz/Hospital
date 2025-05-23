package co.edu.udec.poo.hospital.modelo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class Diagnostico {

    private String nombreEnfermedad;
    private String descripcion;
    private List<Sintoma> sintomas;
    private Receta receta;

    public Diagnostico(String nombreEnfermedad, String descripcion) {
        this.nombreEnfermedad = nombreEnfermedad;
        this.descripcion = descripcion;
        this.sintomas = new ArrayList<>();
    }

    public void agregarSintoma(Sintoma sintoma) {
        sintomas.add(sintoma);
    }

    public void asignarReceta(Receta receta) {
        this.receta = receta;
    }

    public String resumen() {
        return nombreEnfermedad + ": " + descripcion;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }

    public Receta getReceta() {
        return receta;
    }
}
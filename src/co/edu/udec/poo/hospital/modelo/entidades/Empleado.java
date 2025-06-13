
package co.edu.udec.poo.hospital.modelo.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class Empleado {

    private String nombre;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String provincia;
    private String codigoPostal;
    private String NIF;
    private String numSeguSocial;
    private String tipoEmpleado;
    private List<Vacacion> vacaciones;

    public Empleado(String nombre, String direccion, String telefono, String poblacion,
                    String provincia, String codigoPostal, String NIF, String numSeguSocial,
                    String tipoEmpleado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.NIF = NIF;
        this.numSeguSocial = numSeguSocial;
        this.tipoEmpleado = tipoEmpleado;
        this.vacaciones = new ArrayList<>();
    }

    public void agregarVacacion(Vacacion vacacion) {
        vacaciones.add(vacacion);
    }

public boolean estaDeVacacionesHoy() {
    LocalDate hoy = LocalDate.now();
    for (Vacacion v : vacaciones) {
        if (v.estaEnCurso(hoy)) {
            return true;
        }
    }
    return false;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNumSeguSocial() {
        return numSeguSocial;
    }

    public void setNumSeguSocial(String numSeguSocial) {
        this.numSeguSocial = numSeguSocial;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public List<Vacacion> getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(List<Vacacion> vacaciones) {
        this.vacaciones = vacaciones;
    }
}
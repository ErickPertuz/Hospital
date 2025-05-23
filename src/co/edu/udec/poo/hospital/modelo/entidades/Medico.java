package co.edu.udec.poo.hospital.modelo.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



/**
 *
 * @author Erick
 */

public class Medico {

    private String nombre;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String provincia;
    private String codigoPostal;
    private String NIF;
    private String numSeguSocial;
    private String numColegiado;
    private String categoria; // TITULAR, INTERINO, SUSTITUTO
    private Map<String, String> horarioConsulta; // Ej: "Lunes" -> "08:00 - 12:00"
    private List<Sustitucion> historialSustituciones;
    private List<Vacacion> vacaciones;

    public Medico(String nombre, String direccion, String telefono, String poblacion, String provincia,
                  String codigoPostal, String NIF, String numSeguSocial, String numColegiado,
                  String categoria) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.NIF = NIF;
        this.numSeguSocial = numSeguSocial;
        this.numColegiado = numColegiado;
        this.categoria = categoria;
        this.historialSustituciones = new ArrayList<>();
        this.vacaciones = new ArrayList<>();
    }

    public boolean estaActivoComoSustituto() {
    if (!"SUSTITUTO".equalsIgnoreCase(categoria)) return false;
    if (historialSustituciones.isEmpty()) return false;

    Sustitucion ultima = historialSustituciones.get(historialSustituciones.size() - 1);
    return ultima.getFechaBaja() == null || ultima.getFechaAlta().isAfter(ultima.getFechaBaja());
}


    public void agregarVacacion(Vacacion vacacion) {
        vacaciones.add(vacacion);
    }

    public void agregarSustitucion(Sustitucion sustitucion) {
        historialSustituciones.add(sustitucion);
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

    public String getnumSeguSocial() {
        return numSeguSocial;
    }

    public void setnumSeguSocial(String numSeguSocial) {
        this.numSeguSocial = numSeguSocial;
    }

    public String getnumColegiado() {
        return numColegiado;
    }

    public void setnumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Map<String, String> getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(Map<String, String> horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public List<Sustitucion> getHistorialSustituciones() {
        return historialSustituciones;
    }

    public void setHistorialSustituciones(List<Sustitucion> historialSustituciones) {
        this.historialSustituciones = historialSustituciones;
    }

    public List<Vacacion> getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(List<Vacacion> vacaciones) {
        this.vacaciones = vacaciones;
    }
}
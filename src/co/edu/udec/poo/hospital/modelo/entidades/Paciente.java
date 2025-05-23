package co.edu.udec.poo.hospital.modelo.entidades;
/**
 *
 * @author Erick
 */
public class Paciente {

    private String nombre;
    private String direccion;
    private String telefono;
    private String codigoPostal;
    private String NIF;
    private String numSeguSocial;
    private Medico medicoAsignado;

    public Paciente(String nombre, String direccion, String telefono, String codigoPostal,
                    String NIF, String numSeguSocial, Medico medicoAsignado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.NIF = NIF;
        this.numSeguSocial = numSeguSocial;
        this.medicoAsignado = medicoAsignado;
    }

    public String getResumenPaciente() {
        return nombre + " - Médico asignado: " + (medicoAsignado != null ? medicoAsignado.getNombre() : "Ninguno");
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

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }
}
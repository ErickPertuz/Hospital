package co.edu.udec.poo.hospital.modelo.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Erick
 */
public class CitaMedica {

    private LocalDate fecha;
    private LocalTime hora;
    private String consultorio;
    private String EPS;
    private String IPS;
    private Medico medico;
    private Paciente paciente;
    private Diagnostico diagnostico;

    public CitaMedica(LocalDate fecha, LocalTime hora, String consultorio, String EPS, String IPS,
                      Medico medico, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
        this.EPS = EPS;
        this.IPS = IPS;
        this.medico = medico;
        this.paciente = paciente;
    }

    public boolean esHoy() {
        return fecha.equals(LocalDate.now());
    }

    public void asignarDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getIPS() {
        return IPS;
    }

    public void setIPS(String IPS) {
        this.IPS = IPS;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }
}
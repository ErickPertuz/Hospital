package co.edu.udec.poo.hospital.modelo.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class Receta {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<MedicamentoPrescrito> medicamentos;
    private Paciente paciente; 

    public Receta(LocalDate fechaInicio, LocalDate fechaFin, Paciente paciente) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.paciente = paciente;
        this.medicamentos = new ArrayList<>();
    }

    public Receta(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(MedicamentoPrescrito mp) {
        medicamentos.add(mp);
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<MedicamentoPrescrito> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<MedicamentoPrescrito> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
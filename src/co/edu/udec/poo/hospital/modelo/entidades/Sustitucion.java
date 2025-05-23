package co.edu.udec.poo.hospital.modelo.entidades;

import java.time.LocalDate;

/**
 *
 * @author Erick
 */
public class Sustitucion {

    private LocalDate fechaAlta;
    private LocalDate fechaBaja;

    public Sustitucion(LocalDate fechaAlta, LocalDate fechaBaja) {
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public boolean estaActiva() {
        return fechaBaja == null || fechaAlta.isAfter(fechaBaja);
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
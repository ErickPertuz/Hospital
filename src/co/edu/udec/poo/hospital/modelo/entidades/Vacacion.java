
package co.edu.udec.poo.hospital.modelo.entidades;

import java.time.LocalDate;


/**
 *
 * @author Erick
 */
public class Vacacion {

    private LocalDate desde;
    private LocalDate hasta;

    public Vacacion(LocalDate desde, LocalDate hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    public boolean estaEnCurso(LocalDate fecha) {
        return fecha != null && (fecha.isEqual(desde) || fecha.isAfter(desde)) &&
               (fecha.isEqual(hasta) || fecha.isBefore(hasta));
    }

    public LocalDate getDesde() {
        return desde;
    }

    public void setDesde(LocalDate desde) {
        this.desde = desde;
    }

    public LocalDate getHasta() {
        return hasta;
    }

    public void setHasta(LocalDate hasta) {
        this.hasta = hasta;
    }
}
package co.edu.udec.poo.hospital.modelo.entidades;

/**
 *
 * @author Erick
 */
public class MedicamentoPrescrito {

    private Medicamento medicamento;
    private int cantidad;
    private String dosis;

    public MedicamentoPrescrito(Medicamento medicamento, int cantidad, String dosis) {
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.dosis = dosis;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
}
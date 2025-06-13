package co.edu.udec.poo.hospital.modelo.entidades;

/**
 *
 * @author Erick
 */
public class Medicamento {

    private String nombreComercial;
    private String nombreGenerico;
    private String principioActivo;
    private String marca;
    private String presentacion;
    private boolean esGenerico;
    private String unidad;
    private String dosisAdulto;
    private String dosisNino;
    private String contraindicaciones;
    private boolean requiereReceta;
    private boolean cubiertoPorPOS;
    private int unidadesDisponibles;
    private Laboratorio laboratorio;

    public Medicamento(String nombreComercial, String nombreGenerico, String principioActivo,
            String marca, String presentacion, boolean esGenerico, String unidad,
            String dosisAdulto, String dosisNino, String contraindicaciones,
            boolean requiereReceta, boolean cubiertoPorPOS, int unidadesDisponibles,
            Laboratorio laboratorio) {
        this.nombreComercial = nombreComercial;
        this.nombreGenerico = nombreGenerico;
        this.principioActivo = principioActivo;
        this.marca = marca;
        this.presentacion = presentacion;
        this.esGenerico = esGenerico;
        this.unidad = unidad;
        this.dosisAdulto = dosisAdulto;
        this.dosisNino = dosisNino;
        this.contraindicaciones = contraindicaciones;
        this.requiereReceta = requiereReceta;
        this.cubiertoPorPOS = cubiertoPorPOS;
        this.unidadesDisponibles = unidadesDisponibles;
        this.laboratorio = laboratorio;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public boolean isEsGenerico() {
        return esGenerico;
    }

    public void setEsGenerico(boolean esGenerico) {
        this.esGenerico = esGenerico;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getDosisAdulto() {
        return dosisAdulto;
    }

    public void setDosisAdulto(String dosisAdulto) {
        this.dosisAdulto = dosisAdulto;
    }

    public String getDosisNino() {
        return dosisNino;
    }

    public void setDosisNino(String dosisNino) {
        this.dosisNino = dosisNino;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    public boolean isCubiertoPorPOS() {
        return cubiertoPorPOS;
    }

    public void setCubiertoPorPOS(boolean cubiertoPorPOS) {
        this.cubiertoPorPOS = cubiertoPorPOS;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }


   
}
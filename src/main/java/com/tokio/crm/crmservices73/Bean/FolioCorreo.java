package com.tokio.crm.crmservices73.Bean;

public class FolioCorreo {
    String folio;
    String estatus;
    String semaforo;
    String fec_crea;
    String agente;
    String cliente;
    String negocio;
    String producto;
    String correos;
    String nombre;

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(String semaforo) {
        this.semaforo = semaforo;
    }

    public String getFec_crea() {
        return fec_crea;
    }

    public void setFec_crea(String fec_crea) {
        this.fec_crea = fec_crea;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCorreos() {
        return correos;
    }

    public void setCorreos(String correos) {
        this.correos = correos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FolioCorreo{" +
                "folio='" + folio + '\'' +
                ", estatus='" + estatus + '\'' +
                ", semaforo='" + semaforo + '\'' +
                ", fec_crea='" + fec_crea + '\'' +
                ", agente='" + agente + '\'' +
                ", cliente='" + cliente + '\'' +
                ", negocio='" + negocio + '\'' +
                ", producto='" + producto + '\'' +
                ", correos='" + correos + '\'' +
                ", usuario='" + nombre + '\'' +
                '}';
    }
}

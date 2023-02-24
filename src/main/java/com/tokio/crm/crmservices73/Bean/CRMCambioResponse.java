package com.tokio.crm.crmservices73.Bean;

public class CRMCambioResponse extends CRMResponse {

    long agenteId;
    String clave;
    String rfc;
    String nombre;
    String ejecutivo;
    String estatus;

    public long getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(long agenteId) {
        this.agenteId = agenteId;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(String ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}

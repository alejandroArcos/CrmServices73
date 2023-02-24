package com.tokio.crm.crmservices73.Bean;

public class Cotizacion {
    String folio;
    String estatus;
    String canal;
    String area;
    String producto;
    String cve_agente;
    String agente;
    String ejecutivo;
    String oficina;
    String fec_mod;
    String poliza;
    String proceso;
    String vigencia;
    String cot_proceso;
    String carpeta;

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

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCve_agente() {
        return cve_agente;
    }

    public void setCve_agente(String cve_agente) {
        this.cve_agente = cve_agente;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getFec_mod() {
        return fec_mod;
    }

    public void setFec_mod(String fec_mod) {
        this.fec_mod = fec_mod;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getCot_proceso() {
        return cot_proceso;
    }

    public void setCot_proceso(String cot_proceso) {
        this.cot_proceso = cot_proceso;
    }

    public String getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(String ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    @Override
    public String toString() {
        return "Cotizacion{" +
                "folio='" + folio + '\'' +
                ", estatus='" + estatus + '\'' +
                ", canal='" + canal + '\'' +
                ", area='" + area + '\'' +
                ", producto='" + producto + '\'' +
                ", cve_agente='" + cve_agente + '\'' +
                ", agente='" + agente + '\'' +
                ", ejecutivo='" + ejecutivo + '\'' +
                ", oficina='" + oficina + '\'' +
                ", fec_mod='" + fec_mod + '\'' +
                ", poliza='" + poliza + '\'' +
                ", proceso='" + proceso + '\'' +
                ", vigencia='" + vigencia + '\'' +
                ", cot_proceso='" + cot_proceso + '\'' +
                '}';
    }
}

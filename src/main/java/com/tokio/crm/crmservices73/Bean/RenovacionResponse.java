package com.tokio.crm.crmservices73.Bean;

public class RenovacionResponse {
    String msg;
    String code;
    String cliente;
    String negocio;
    String participantes;
    String producto;
    String canal;
    String ejecutivo;
    String agente;
    String moneda;
    String fec_ini;
    String fec_fin;
    String fec_alta;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(String ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getFec_ini() {
        return fec_ini;
    }

    public void setFec_ini(String fec_ini) {
        this.fec_ini = fec_ini;
    }

    public String getFec_fin() {
        return fec_fin;
    }

    public void setFec_fin(String fec_fin) {
        this.fec_fin = fec_fin;
    }

    public String getFec_alta() {
        return fec_alta;
    }

    public void setFec_alta(String fec_alta) {
        this.fec_alta = fec_alta;
    }

    @Override
    public String toString() {
        return "RenovacionResponse{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", cliente='" + cliente + '\'' +
                ", negocio='" + negocio + '\'' +
                ", participantes='" + participantes + '\'' +
                ", producto='" + producto + '\'' +
                ", canal='" + canal + '\'' +
                ", ejecutivo='" + ejecutivo + '\'' +
                ", agente='" + agente + '\'' +
                ", moneda='" + moneda + '\'' +
                ", fec_ini='" + fec_ini + '\'' +
                ", fec_fin='" + fec_fin + '\'' +
                ", fec_alta='" + fec_alta + '\'' +
                '}';
    }
}

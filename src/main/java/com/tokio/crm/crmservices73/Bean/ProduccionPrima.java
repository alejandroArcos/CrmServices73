package com.tokio.crm.crmservices73.Bean;

public class ProduccionPrima {
    String agente;
    String ejecutivo;
    String area;
    String mes;
    String anio;
    String moneda;
    double monto;
    double tipo_cambio_bp;
    double monto_bp;
    double real;
    double budget;

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(String ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTipo_cambio_bp() {
        return tipo_cambio_bp;
    }

    public void setTipo_cambio_bp(double tipo_cambio_bp) {
        this.tipo_cambio_bp = tipo_cambio_bp;
    }

    public double getMonto_bp() {
        return monto_bp;
    }

    public void setMonto_bp(double monto_bp) {
        this.monto_bp = monto_bp;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "ProduccionPrima{" +
                "agente='" + agente + '\'' +
                ", ejecutivo='" + ejecutivo + '\'' +
                ", area='" + area + '\'' +
                ", mes='" + mes + '\'' +
                ", anio='" + anio + '\'' +
                ", moneda='" + moneda + '\'' +
                ", monto=" + monto +
                ", tipo_cambio_bp=" + tipo_cambio_bp +
                ", monto_bp=" + monto_bp +
                ", real=" + real +
                ", budget=" + budget +
                '}';
    }
}

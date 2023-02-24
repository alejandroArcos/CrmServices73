package com.tokio.crm.crmservices73.Bean;

public class Ejecutivo {

    long idEjecutivo;
    String nombreEjecutivo;

    public long getIdEjecutivo() {
	return idEjecutivo;
    }

    public void setIdEjecutivo(long idEjecutivo) {
	this.idEjecutivo = idEjecutivo;
    }

    public String getNombreEjecutivo() {
	return nombreEjecutivo;
    }

    public void setNombreEjecutivo(String nombreEjecutivo) {
	this.nombreEjecutivo = nombreEjecutivo;
    }

    @Override
    public String toString() {
	return "Ejecutivo [idEjecutivo=" + idEjecutivo + ", nombreEjecutivo=" + nombreEjecutivo + "]";
    }

    public Ejecutivo(long idEjecutivo, String nombreEjecutivo) {
	super();
	this.idEjecutivo = idEjecutivo;
	this.nombreEjecutivo = nombreEjecutivo;
    }

}

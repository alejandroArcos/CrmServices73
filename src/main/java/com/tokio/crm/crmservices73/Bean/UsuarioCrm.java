package com.tokio.crm.crmservices73.Bean;

public class UsuarioCrm {

    public String nombre;
    public int id;
    public int oficina;

    public UsuarioCrm() {

    }

    public UsuarioCrm(String nombre, int id, int oficina) {
	this.nombre = nombre;
	this.id = id;
	this.oficina = oficina;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getOficina() {
	return oficina;
    }

    public void setOficina(int oficina) {
	this.oficina = oficina;
    }

    @Override
    public String toString() {
	return "UsuarioCrm [nombre=" + nombre + ", id=" + id + ", oficina=" + oficina + "]";
    }

}

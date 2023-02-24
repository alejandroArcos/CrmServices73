package com.tokio.crm.crmservices73.Bean;

public class ClienteParcial {
    String codigo;
    String rfc;
    String nombre;
    String oficina;
    String estatus;
    
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public String getOficina() {
		return oficina;
	}
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	@Override
	public String toString() {
		return "ClienteParcial [codigo=" + codigo + ", rfc=" + rfc + ", nombre=" + nombre + ", oficina=" + oficina
				+ ", estatus=" + estatus + "]";
	}
}

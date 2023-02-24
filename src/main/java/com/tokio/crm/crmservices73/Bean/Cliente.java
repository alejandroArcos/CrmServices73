package com.tokio.crm.crmservices73.Bean;

public class Cliente {
	
	private String rfc;
	private String nombre;
	private String estatus;
	private String codigo;
	private String oficina;
	
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
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getOficina() {
		return oficina;
	}
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	
	@Override
	public String toString() {
		return "Cliente [rfc=" + rfc + ", nombre=" + nombre + ", estatus=" + estatus + ", codigo=" + codigo
				+ ", oficina=" + oficina + "]";
	}
	
}

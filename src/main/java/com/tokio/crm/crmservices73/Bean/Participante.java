package com.tokio.crm.crmservices73.Bean;

public class Participante {
    private String codigo;
    private String nombre;
    private String principal;
    private String participante;
    private String porcentaje;
    
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getParticipante() {
		return participante;
	}
	public void setParticipante(String participante) {
		this.participante = participante;
	}
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	@Override
	public String toString() {
		return "Participante [codigo=" + codigo + ", nombre=" + nombre + ", principal=" + principal + ", participante="
				+ participante + ", porcentaje=" + porcentaje + "]";
	}
    
}

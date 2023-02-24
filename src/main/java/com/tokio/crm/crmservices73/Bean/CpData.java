package com.tokio.crm.crmservices73.Bean;

public class CpData {
	
	int id;
	String codigo;
	String colonia;
	String delegacion;
	String estado;
	String pais;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getDelegacion() {
		return delegacion;
	}
	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "CpData [id=" + id + ", codigo=" + codigo + ", colonia=" + colonia + ", delegacion=" + delegacion
				+ ", estado=" + estado + ", pais=" + pais + "]";
	}
	
	
}

package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class PersonasResponse {
	private String msg;
	private int code;
	private int total;
	private List<Persona> lista;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Persona> getLista() {
		return lista;
	}
	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "PersonasResponse [msg=" + msg + ", code=" + code + ", total=" + total + ", lista=" + lista + "]";
	}
	
}

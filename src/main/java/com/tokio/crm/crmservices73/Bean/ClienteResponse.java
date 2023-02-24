package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class ClienteResponse {

	private String msg;
	private int code;
	private int total;
	private List<Cliente> lista;
	
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
	public List<Cliente> getLista() {
		return lista;
	}
	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "ClienteResponse [msg=" + msg + ", code=" + code + ", total=" + total + ", lista=" + lista + "]";
	}
	
}

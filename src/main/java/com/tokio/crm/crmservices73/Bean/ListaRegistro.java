package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class ListaRegistro {
	
	private List<Registro> lista;
	private int totalRow;
	private String msg;
	private int code;
	
	public List<Registro> getLista() {
		return lista;
	}
	
	public void setLista(List<Registro> lista) {
		this.lista = lista;
	}
	
	public int getTotalRow() {
		return totalRow;
	}
	
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}
	
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

	@Override
	public String toString() {
		return "ListaRegistro{" +
				"lista=" + lista +
				", totalRow=" + totalRow +
				", msg='" + msg + '\'' +
				", code=" + code +
				'}';
	}
}

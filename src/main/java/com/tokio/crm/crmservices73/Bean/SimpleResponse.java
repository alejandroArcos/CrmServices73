package com.tokio.crm.crmservices73.Bean;

public class SimpleResponse {
	private String msg;
	private int code;
	private boolean valida;
	private String codigo;
	private String otro;
	
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
	public boolean isValida() {
		return valida;
	}
	public void setValida(boolean valida) {
		this.valida = valida;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getOtro() {
		return otro;
	}
	public void setOtro(String otro) {
		this.otro = otro;
	}
	
	@Override
	public String toString() {
		return "SimpleResponse [msg=" + msg + ", code=" + code + ", valida=" + valida + ", codigo=" + codigo + ", otro="
				+ otro + "]";
	}
	
}

package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class ListaCpData {

	private List<CpData> cpData;
	private int totalRow;
	private String msg;
	private int code;
	
	
	public List<CpData> getCpData() {
		return cpData;
	}
	public void setCpData(List<CpData> cpData) {
		this.cpData = cpData;
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
	    return "ListaCpData [cpData=" + cpData + ", totalRow=" + totalRow + ", msg=" + msg + ", code=" + code + "]";
	}
				
}

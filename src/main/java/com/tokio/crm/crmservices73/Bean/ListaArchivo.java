package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class ListaArchivo {

    List<Archivo> archivo;
    int rownum;
    String code;
    String msg;
    public List<Archivo> getArchivo() {
        return archivo;
    }
    public void setArchivo(List<Archivo> archivo) {
        this.archivo = archivo;
    }
    public int getRownum() {
        return rownum;
    }
    public void setRownum(int rownum) {
        this.rownum = rownum;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString() {
	return "ListaArchivo [archivo=" + archivo + ", rownum=" + rownum + ", code=" + code + ", msg=" + msg + "]";
    }
    
}

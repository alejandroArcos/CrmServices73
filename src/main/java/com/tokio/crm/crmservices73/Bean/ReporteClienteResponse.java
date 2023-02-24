package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class ReporteClienteResponse {
    private String msg;
    private int code;
    private int total;
    private List<ReporteCliente> lista;

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

    public List<ReporteCliente> getLista() {
        return lista;
    }

    public void setLista(List<ReporteCliente> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ReporteClienteResponse{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", total=" + total +
                ", lista=" + lista +
                '}';
    }
}

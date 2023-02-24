package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class CotizacionResponse {
    String msg;
    int code;
    int total;
    List<Cotizacion> lista;

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

    public List<Cotizacion> getLista() {
        return lista;
    }

    public void setLista(List<Cotizacion> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "CotizacionResponse{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", total=" + total +
                ", lista=" + lista +
                '}';
    }
}

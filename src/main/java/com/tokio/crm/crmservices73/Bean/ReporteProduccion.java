package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class ReporteProduccion {
    String msg;
    String code;
    String total;
    List<FilaReporteProduccion> lista;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<FilaReporteProduccion> getLista() {
        return lista;
    }

    public void setLista(List<FilaReporteProduccion> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ReporteProduccion{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", total='" + total + '\'' +
                ", lista=" + lista +
                '}';
    }
}

package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class MovimientosProduccion {
    String msg;
    int code;
    int total;
    List<MovimientoProduccion> lista;

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

    public List<MovimientoProduccion> getLista() {
        return lista;
    }

    public void setLista(List<MovimientoProduccion> lista) {
        this.lista = lista;
    }
}

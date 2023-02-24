package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class CatalogoMoneda {
    int totalRow;
    String msg;
    int code;
    List<Moneda> lista;

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

    public List<Moneda> getLista() {
        return lista;
    }

    public void setLista(List<Moneda> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "CatalogoMoneda{" +
                "totalRow=" + totalRow +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                ", lista=" + lista +
                '}';
    }
}

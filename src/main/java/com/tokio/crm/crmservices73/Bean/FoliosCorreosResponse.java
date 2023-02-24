package com.tokio.crm.crmservices73.Bean;

import java.util.List;
public class FoliosCorreosResponse {
    String msg;
    int total;
    int code;
    List<FolioCorreo> lista;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<FolioCorreo> getLista() {
        return lista;
    }

    public void setLista(List<FolioCorreo> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "FoliosCorreosResponse{" +
                "msg='" + msg + '\'' +
                ", total=" + total +
                ", code=" + code +
                ", lista=" + lista +
                '}';
    }
}

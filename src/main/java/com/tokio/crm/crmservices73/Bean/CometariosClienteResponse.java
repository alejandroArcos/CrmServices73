package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class CometariosClienteResponse {
    String msg;
    String code;
    List<ComentarioCliente> lista;

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

    public List<ComentarioCliente> getLista() {
        return lista;
    }

    public void setLista(List<ComentarioCliente> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "CometariosClienteResponse{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", lista=" + lista +
                '}';
    }
}

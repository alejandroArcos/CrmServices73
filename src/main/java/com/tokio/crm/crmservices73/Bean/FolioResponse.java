package com.tokio.crm.crmservices73.Bean;

public class FolioResponse {
    String msg;
    int code;
    String folio;

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

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Override
    public String toString() {
        return "FolioResponse{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", folio='" + folio + '\'' +
                '}';
    }
}

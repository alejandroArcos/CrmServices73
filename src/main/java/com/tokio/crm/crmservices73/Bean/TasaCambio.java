package com.tokio.crm.crmservices73.Bean;

public class TasaCambio {
    String msg;
    String code;
    double tc;

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

    public double getTc() {
        return tc;
    }

    public void setTc(double tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        return "TasaCambio{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", tc=" + tc +
                '}';
    }
}

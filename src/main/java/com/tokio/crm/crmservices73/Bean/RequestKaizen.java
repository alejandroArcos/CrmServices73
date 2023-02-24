package com.tokio.crm.crmservices73.Bean;

public class RequestKaizen {
    String p_codigo;
    String p_rfc;
    String p_nombre;
    String p_paterno;
    String p_materno;
    String p_genero;
    String p_fecha;
    String p_tipper;
    String p_regimen;
    String p_calle;
    String p_numero;
    String p_colonia;
    String p_cp;   
    String p_email;
    
    
    public String getP_codigo() {
        return p_codigo;
    }
    public void setP_codigo(String p_codigo) {
        this.p_codigo = p_codigo;
    }
    public String getP_rfc() {
        return p_rfc;
    }
    public void setP_rfc(String p_rfc) {
        this.p_rfc = p_rfc;
    }
    public String getP_nombre() {
        return p_nombre;
    }
    public void setP_nombre(String p_nombre) {
        this.p_nombre = p_nombre;
    }
    public String getP_paterno() {
        return p_paterno;
    }
    public void setP_paterno(String p_paterno) {
        this.p_paterno = p_paterno;
    }
    public String getP_materno() {
        return p_materno;
    }
    public void setP_materno(String p_materno) {
        this.p_materno = p_materno;
    }
    public String getP_genero() {
        return p_genero;
    }
    public void setP_genero(String p_genero) {
        this.p_genero = p_genero;
    }
    public String getP_fecha() {
        return p_fecha;
    }
    public void setP_fecha(String p_fecha) {
        this.p_fecha = p_fecha;
    }
    public String getP_tipper() {
        return p_tipper;
    }
    public void setP_tipper(String p_tipper) {
        this.p_tipper = p_tipper;
    }
    public String getP_calle() {
        return p_calle;
    }
    public void setP_calle(String p_calle) {
        this.p_calle = p_calle;
    }
    public String getP_numero() {
        return p_numero;
    }
    public void setP_numero(String p_numero) {
        this.p_numero = p_numero;
    }
    public String getP_colonia() {
        return p_colonia;
    }
    public void setP_colonia(String p_colonia) {
        this.p_colonia = p_colonia;
    }
    public String getP_cp() {
        return p_cp;
    }
    public void setP_cp(String p_cp) {
        this.p_cp = p_cp;
    }
    public String getP_email() {
        return p_email;
    }
    public void setP_email(String p_email) {
        this.p_email = p_email;
    }

    public String getP_regimen() {
        return p_regimen;
    }

    public void setP_regimen(String p_regimen) {
        this.p_regimen = p_regimen;
    }

    @Override
    public String toString() {
        return "RequestKaizen{" +
                "p_codigo='" + p_codigo + '\'' +
                ", p_rfc='" + p_rfc + '\'' +
                ", p_nombre='" + p_nombre + '\'' +
                ", p_paterno='" + p_paterno + '\'' +
                ", p_materno='" + p_materno + '\'' +
                ", p_genero='" + p_genero + '\'' +
                ", p_fecha='" + p_fecha + '\'' +
                ", p_tipper='" + p_tipper + '\'' +
                ", p_regimen='" + p_regimen + '\'' +
                ", p_calle='" + p_calle + '\'' +
                ", p_numero='" + p_numero + '\'' +
                ", p_colonia='" + p_colonia + '\'' +
                ", p_cp='" + p_cp + '\'' +
                ", p_email='" + p_email + '\'' +
                '}';
    }
}

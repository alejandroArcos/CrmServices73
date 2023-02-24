package com.tokio.crm.crmservices73.Bean;

public class Moneda {
    int id;
    int codigo;
    String descripcion;
    String valor;
    String tipo;
    int activo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", valor='" + valor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", activo=" + activo +
                '}';
    }
}

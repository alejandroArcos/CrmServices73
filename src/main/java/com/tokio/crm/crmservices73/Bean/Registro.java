package com.tokio.crm.crmservices73.Bean;

public class Registro {

    private String codigo;
    private String descripcion;
    private int idCatalogoDetalle;
    private String valor;
    private int activo;
    private int id;
    private String tipo;
    private String otro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdCatalogoDetalle() {
        return idCatalogoDetalle;
    }

    public void setIdCatalogoDetalle(int idCatalogoDetalle) {
        this.idCatalogoDetalle = idCatalogoDetalle;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Registro[" + "codigo=" + codigo + ", descripcion=" + descripcion +
                ", idCatalogoDetalle=" + idCatalogoDetalle + ", valor=" + valor + ", activo=" + activo +
                ", id=" + id + ", tipo=" + tipo + ", otro=" + otro + ']';
    }
}

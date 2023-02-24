package com.tokio.crm.crmservices73.Bean;

public class ComentarioCliente {
    String usuario;
    String mensaje;
    String fecha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ComentarioCliente{" +
                "usuario='" + usuario + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}

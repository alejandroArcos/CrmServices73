package com.tokio.crm.crmservices73.Bean;

public class Archivo {
    
    String id;
    String descripcion;
    String nombre;
    String extension;
    String archivo;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getArchivo() {
        return archivo;
    }
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    @Override
    public String toString() {
	return "Archivo [id=" + id + ", descripcion=" + descripcion + ", nombre=" + nombre + ", extension=" + extension
		+ ", archivo=" + archivo + "]";
    }
    
    
}

package com.tokio.crm.crmservices73.Bean;

public class CRMClaveResponse extends CRMResponse {

    String clave;
    String preclave;
    String agrupador;

    public String getPreclave() {
	return preclave;
    }

    public void setPreclave(String preclave) {
	this.preclave = preclave;
    }

    public String getAgrupador() {
	return agrupador;
    }

    public void setAgrupador(String agrupador) {
	this.agrupador = agrupador;
    }

    public String getClave() {
	return clave;
    }

    public void setClave(String clave) {
	this.clave = clave;
    }

    @Override
    public String toString() {
	return "CRMPreclaveResponse [clave=" + clave + ", preclave=" + preclave + ", agrupador=" + agrupador + "]";
    }

}

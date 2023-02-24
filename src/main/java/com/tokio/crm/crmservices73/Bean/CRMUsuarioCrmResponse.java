package com.tokio.crm.crmservices73.Bean;

import java.util.List;

public class CRMUsuarioCrmResponse extends CRMResponse {

    List<UsuarioCrm> ejecutivos;

    public List<UsuarioCrm> getEjecutivos() {
        return ejecutivos;
    }

    public void setEjecutivos(List<UsuarioCrm> ejecutivos) {
        this.ejecutivos = ejecutivos;
    }

    @Override
    public String toString() {
	return "CRMUsuarioCrmResponse [ejecutivos=" + ejecutivos + "]";
    }         
        

}

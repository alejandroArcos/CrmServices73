package com.tokio.crm.crmservices73.Bean;

import java.util.ArrayList;
import java.util.List;

public class CRMAgentesResponse extends CRMResponse {

    List<Agente> agentes = new ArrayList<>();

    public List<Agente> getAgentes() {
        return agentes;
    }

    public void setAgentes(List<Agente> agentes) {
        this.agentes = agentes;
    }
}

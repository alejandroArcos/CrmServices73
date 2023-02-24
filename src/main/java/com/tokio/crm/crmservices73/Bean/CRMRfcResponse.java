package com.tokio.crm.crmservices73.Bean;

public class CRMRfcResponse extends CRMResponse {

    String rfc;    
    long agenteId;
    
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public long getAgenteId() {
        return agenteId;
    }
    public void setAgenteId(long agenteId) {
        this.agenteId = agenteId;
    }
    
}

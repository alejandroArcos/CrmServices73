package com.tokio.crm.crmservices73.Bean;

public class Tramite {
	private String folio;
	private String estatus;
	private String semaforo;
	private String fec_crea;
	private String cve_cliente;
	private String cliente;
	private String cve_agente;
	private String agente;
	private String agrupador;
	private String negocio;
	private String producto;
	private String prima_objetivo;
	private String prima_cotizada;
	private String movimiento;
	private String fec_mod;
	private String fec_entrega;
	private String coaseguro;
	private String moneda;
	private String cve_ejecutivo;
	private String ejecutivo;
	private String oficina;
	private String carpeta;
	private String seguimiento;
	
	/*Info adicional tabla*/
	private String semaforoStr;
	private String participantes;
	private String accionStr;
	private String estatusStr;
	private String causaStr;
	
	/*InfoCodificada*/
	private String folio64;
	private String usuario64;
	
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getSemaforo() {
		return semaforo;
	}
	public void setSemaforo(String semaforo) {
		this.semaforo = semaforo;
	}
	public String getFec_crea() {
		return fec_crea;
	}
	public void setFec_crea(String fec_crea) {
		this.fec_crea = fec_crea;
	}
	public String getCve_cliente() {
		return cve_cliente;
	}
	public void setCve_cliente(String cve_cliente) {
		this.cve_cliente = cve_cliente;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCve_agente() {
		return cve_agente;
	}
	public void setCve_agente(String cve_agente) {
		this.cve_agente = cve_agente;
	}
	public String getAgente() {
		return agente;
	}
	public void setAgente(String agente) {
		this.agente = agente;
	}
	public String getAgrupador() {
		return agrupador;
	}
	public void setAgrupador(String agrupador) {
		this.agrupador = agrupador;
	}
	public String getNegocio() {
		return negocio;
	}
	public void setNegocio(String negocio) {
		this.negocio = negocio;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getPrima_objetivo() {
		return prima_objetivo;
	}
	public void setPrima_objetivo(String prima_objetivo) {
		this.prima_objetivo = prima_objetivo;
	}
	public String getPrima_cotizada() {
		return prima_cotizada;
	}
	public void setPrima_cotizada(String prima_cotizada) {
		this.prima_cotizada = prima_cotizada;
	}
	public String getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}
	public String getFec_mod() {
		return fec_mod;
	}
	public void setFec_mod(String fec_mod) {
		this.fec_mod = fec_mod;
	}
	public String getFec_entrega() {
		return fec_entrega;
	}
	public void setFec_entrega(String fec_entrega) {
		this.fec_entrega = fec_entrega;
	}
	public String getCoaseguro() {
		return coaseguro;
	}
	public void setCoaseguro(String coaseguro) {
		this.coaseguro = coaseguro;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getCve_ejecutivo() {
		return cve_ejecutivo;
	}
	public void setCve_ejecutivo(String cve_ejecutivo) {
		this.cve_ejecutivo = cve_ejecutivo;
	}
	public String getEjecutivo() {
		return ejecutivo;
	}
	public void setEjecutivo(String ejecutivo) {
		this.ejecutivo = ejecutivo;
	}
	public String getOficina() {
		return oficina;
	}
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	public String getCarpeta() {
		return carpeta;
	}
	public void setCarpeta(String carpeta) {
		this.carpeta = carpeta;
	}
	public String getSeguimiento() {
		return seguimiento;
	}
	public void setSeguimiento(String seguimiento) {
		this.seguimiento = seguimiento;
	}
	public String getSemaforoStr() {
		return semaforoStr;
	}
	public void setSemaforoStr(String semaforoStr) {
		this.semaforoStr = semaforoStr;
	}
	public String getParticipantes() {
		return participantes;
	}
	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}
	public String getAccionStr() {
		return accionStr;
	}
	public void setAccionStr(String accionStr) {
		this.accionStr = accionStr;
	}
	public String getEstatusStr() {
		return estatusStr;
	}
	public void setEstatusStr(String estatusStr) {
		this.estatusStr = estatusStr;
	}
	public String getCausaStr() {
		return causaStr;
	}
	public void setCausaStr(String causaStr) {
		this.causaStr = causaStr;
	}
	public String getFolio64() {
		return folio64;
	}
	public void setFolio64(String folio64) {
		this.folio64 = folio64;
	}
	public String getUsuario64() {
		return usuario64;
	}
	public void setUsuario64(String usuario64) {
		this.usuario64 = usuario64;
	}
	
	@Override
	public String toString() {
		return "Tramite [folio=" + folio + ", estatus=" + estatus + ", semaforo=" + semaforo + ", fec_crea=" + fec_crea
				+ ", cve_cliente=" + cve_cliente + ", cliente=" + cliente + ", cve_agente=" + cve_agente + ", agente="
				+ agente + ", agrupador=" + agrupador + ", negocio=" + negocio + ", producto=" + producto
				+ ", prima_objetivo=" + prima_objetivo + ", prima_cotizada=" + prima_cotizada + ", movimiento="
				+ movimiento + ", fec_mod=" + fec_mod + ", fec_entrega=" + fec_entrega + ", coaseguro=" + coaseguro
				+ ", moneda=" + moneda + ", cve_ejecutivo=" + cve_ejecutivo + ", ejecutivo=" + ejecutivo + ", oficina="
				+ oficina + ", carpeta=" + carpeta + ", seguimiento=" + seguimiento + ", semaforoStr=" + semaforoStr
				+ ", participantes=" + participantes + ", accionStr=" + accionStr + ", estatusStr=" + estatusStr
				+ ", causaStr=" + causaStr + ", folio64=" + folio64 + ", usuario64=" + usuario64 + "]";
	}
	
}

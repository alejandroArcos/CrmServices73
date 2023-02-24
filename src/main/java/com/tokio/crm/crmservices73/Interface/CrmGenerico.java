package com.tokio.crm.crmservices73.Interface;

import com.google.gson.JsonArray;
import com.tokio.crm.crmservices73.Bean.CRMResponse;
import com.tokio.crm.crmservices73.Bean.CatalogoMoneda;
import com.tokio.crm.crmservices73.Bean.ClienteInfoResponse;
import com.tokio.crm.crmservices73.Bean.ClienteParcialResponse;
import com.tokio.crm.crmservices73.Bean.ClienteResponse;
import com.tokio.crm.crmservices73.Bean.CometariosClienteResponse;
import com.tokio.crm.crmservices73.Bean.CotizacionResponse;
import com.tokio.crm.crmservices73.Bean.FolioResponse;
import com.tokio.crm.crmservices73.Bean.FoliosCorreosResponse;
import com.tokio.crm.crmservices73.Bean.ListaArchivo;
import com.tokio.crm.crmservices73.Bean.ListaCpData;
import com.tokio.crm.crmservices73.Bean.ListaParticipantes;
import com.tokio.crm.crmservices73.Bean.ListaRegistro;
import com.tokio.crm.crmservices73.Bean.MovimientosProduccion;
import com.tokio.crm.crmservices73.Bean.PersonasResponse;
import com.tokio.crm.crmservices73.Bean.ProduccionPrimaResponse;
import com.tokio.crm.crmservices73.Bean.RenovacionResponse;
import com.tokio.crm.crmservices73.Bean.ReporteAgentesResponse;
import com.tokio.crm.crmservices73.Bean.ReporteClienteResponse;
import com.tokio.crm.crmservices73.Bean.ReporteProduccion;
import com.tokio.crm.crmservices73.Bean.RequestKaizen;
import com.tokio.crm.crmservices73.Bean.SimpleResponse;
import com.tokio.crm.crmservices73.Bean.TasaCambio;
import com.tokio.crm.crmservices73.Bean.TramiteResponse;
import com.tokio.crm.crmservices73.Exeption.CrmServicesException;

public interface CrmGenerico {
	
	public ListaRegistro getCatalogo(int rownum, String tiptransaccion, String codigo, int activo, String usuario,String pantalla) throws CrmServicesException;
	
	public ListaCpData getCatalogoCP(String cp,String usuario,String pantalla)throws CrmServicesException;
	
	public CRMResponse insertaAgenteKaizen(RequestKaizen requestKaizen,String usuario,String pantalla)throws CrmServicesException;

	public CRMResponse actualizaAgenteKaizen(RequestKaizen requestKaizen,String usuario,String pantalla)throws CrmServicesException;

	public CRMResponse subirDocumento(String agente,String tipoDoc,String nombreArchivo,String extension,String dataArchivo,String usuario, String pantalla, String leer, String url)throws CrmServicesException;

	CRMResponse eliminarDocumento(String agente, String dataArchivo, String usuario, String pantalla) throws CrmServicesException;
	
	public ListaArchivo listaDocumentos(String agente,String usuario,String pantalla)throws CrmServicesException;
	
	public ListaArchivo descargarDocumento(String agente,String tipoDoc,String usuario,String pantalla)throws CrmServicesException;

	public CatalogoMoneda getCatalogoMoneda(String usuario, String pantalla) throws CrmServicesException;

	public TasaCambio getTasaCambio(String anio, String mes, String usuario,String pantalla) throws CrmServicesException;

	public MovimientosProduccion getReporteProduccionMovimientos(String area, String anio, String mes, String usuario, String pantalla) throws CrmServicesException;

	public ReporteProduccion getReporteProduccion(String reporte, String area, String anio, String mes, String usuario, String pantalla) throws CrmServicesException;
	
	public ClienteResponse getListaCliente (String usuario, String pantalla) throws CrmServicesException;
	
	public ClienteInfoResponse getClienteInfo (String usuario, String pantalla, String codigo) throws CrmServicesException;
	
	public SimpleResponse validaRfc (String usuario, String pantalla, String rfc) throws CrmServicesException;
	
	public SimpleResponse guardaCliente (String usuario, String pantalla, String tipoGuardar, String codigo, String rfc, String curp, int tipper, int regimen,
    		String nombre, String paterno, String materno, int sociedad, String calle, String numExt, String numInt, int colonia, String cp, String email, String telefono,
    		String telefonoadic, String ocupacion, String pais_nac, int dom_mex, int cuenta_pro, String met_pago, int banco, String cuenta,
    		int nacionalidad, String pais_constitucion, String folio_mercantil, String representante_legal, String fecha_constitucion, int giro, String fiel, String estatus, String observaciones)
    		throws CrmServicesException;

	CometariosClienteResponse getComentariosCliente (String usuario, String pantalla, String codigoCliente) throws CrmServicesException;

	public SimpleResponse validaCotizacion (String usuario, String pantalla, String cliente, String canal, String producto, String ejecutivo) throws CrmServicesException;

	public FolioResponse generaFolio (String usuario, String pantalla) throws CrmServicesException;

	public CotizacionResponse obtenerCotizaciones (String usuario, String pantalla, String codigoCliente) throws CrmServicesException;

	public CRMResponse guardaCotizacion (String usuario, String pantalla, String folio,String cliente, String agente,
										 String producto, String movimiento, String negocio, JsonArray participantes,
										 String moneda, String fecini, String fecfin, String fecsol, String fecrea,
										 String control, String email, String gp_flag, String canal, String ejecutivo) throws CrmServicesException;

	public ClienteParcialResponse obtenerClientesAutoComplete(String usuario, String pantalla, String codigo, String rfc, String nombre, String estatus) throws CrmServicesException;

	public ListaRegistro getCatalogo(int rownum, String tiptransaccion, String codigo, int activo, String valor,String usuario,String pantalla) throws CrmServicesException;

	public ListaParticipantes getListaParticipantes(String usuario, String pantalla, String nombre, String participante, String negocio) throws CrmServicesException;

	public RenovacionResponse getRenovacionCotizacion(String usuario,String pantalla, String poliza) throws CrmServicesException;

	public FoliosCorreosResponse getFoliosCorreos(String usuario, String pantalla, String codigo) throws CrmServicesException;
	
	public TramiteResponse getTramitesFiltro(String usuario, String pantalla, String codigoCliente, String agente, String ejecutivo, String folio,
    		String estatus, String fecini, String fecfin) throws CrmServicesException;

	public ReporteAgentesResponse getReporteAgentes(String usuario, String pantalla, String fechaInicio, String fechaFin, String canal, String filtro) throws CrmServicesException;

	public  ReporteClienteResponse getReporteClientes(String usuario, String pantalla, String fechaInicio, String fechaFin, String canal, String filtro) throws CrmServicesException;

	public PersonasResponse getPersonas(String usuario, String pantalla, String tipo) throws CrmServicesException;
	public ProduccionPrimaResponse getReporteProduccionPrima(String usuario, String pantalla, String fecha_inicio, String fecha_fin) throws CrmServicesException;
	
	public ListaParticipantes wsParticipantes(String usuario, String pantalla, int folio) throws CrmServicesException;
}

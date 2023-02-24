package com.tokio.crm.crmservices73.Impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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
import com.tokio.crm.crmservices73.Interface.CrmGenerico;
import com.tokio.crm.crmservices73.Util.ConsumeServicio;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {}, service = CrmGenerico.class)

public class CrmGenericoImpl implements CrmGenerico {

    ConsumeServicio servis = new ConsumeServicio();

    @Override
    public ListaRegistro getCatalogo(int rownum, String tiptransaccion, String codigo, int activo, String usuario,
                                     String pantalla) throws CrmServicesException {

        String webservice = "WS_CATALOGO";
        String webmethod = "WS_CATALOGO";
        String direction = "/PortalCRM/ws_catalogo";
        JsonObject request = new JsonObject();

        request.addProperty("p_rowNum", rownum);
        request.addProperty("p_tipTransaccion", tiptransaccion);
        request.addProperty("p_codigo", codigo);
        request.addProperty("p_activo", activo);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);

        ListaRegistro respuesta = (ListaRegistro) servis.getObjResponse(direction, request.toString(),
                ListaRegistro.class);

        return respuesta;
    }

    @Override
    public ListaCpData getCatalogoCP(String cp, String usuario, String pantalla) throws CrmServicesException {

        String webservice = "WS_DIRECCION";
        String webmethod = "WS_DIRECCION";
        String direction = "/PortalCRM/ws_direccion";
        JsonObject request = new JsonObject();

        request.addProperty("p_cp", cp);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);

        ListaCpData respuesta = (ListaCpData) servis.getObjResponse(direction, request.toString(), ListaCpData.class);

        return respuesta;
    }

    @Override
    public CRMResponse insertaAgenteKaizen(RequestKaizen requestKaizen, String usuario, String pantalla)
            throws CrmServicesException {
        // String webservice = "WS_INSERTA_AGENTE";
        String webmethod = "WS_INSERTA_AGENTE";
        String direction = "/PortalCRM/ws_insertagente";

        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_codigo", requestKaizen.getP_codigo());
        request.addProperty("p_rfc", requestKaizen.getP_rfc());
        request.addProperty("p_nombre", requestKaizen.getP_nombre());
        request.addProperty("p_paterno", requestKaizen.getP_paterno());
        request.addProperty("p_materno", requestKaizen.getP_materno());
        request.addProperty("p_genero", requestKaizen.getP_genero());
        request.addProperty("p_fecha", requestKaizen.getP_fecha());
        request.addProperty("p_tipper", requestKaizen.getP_tipper());
        request.addProperty("p_regimen", requestKaizen.getP_regimen());
        request.addProperty("p_calle", requestKaizen.getP_calle());
        request.addProperty("p_numero", requestKaizen.getP_numero());
        request.addProperty("p_colonia", requestKaizen.getP_colonia());
        request.addProperty("p_cp", requestKaizen.getP_cp());
        request.addProperty("p_email", requestKaizen.getP_email());
        CRMResponse respuesta = (CRMResponse) servis.getObjResponse(direction, request.toString(), CRMResponse.class);
        return respuesta;
    }

    @Override
    public CRMResponse actualizaAgenteKaizen(RequestKaizen requestKaizen, String usuario, String pantalla) throws CrmServicesException {
        // String webservice = "WS_INSERTA_AGENTE";
        String webmethod = "WS_ACTUALIZA_AGENTE";
        String direction = "/PortalCRM/ws_actualizagente";

        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_codigo", requestKaizen.getP_codigo());
        request.addProperty("p_rfc", requestKaizen.getP_rfc());
        request.addProperty("p_regimen", requestKaizen.getP_regimen());
        request.addProperty("p_nombre", requestKaizen.getP_nombre());
        request.addProperty("p_paterno", requestKaizen.getP_paterno());
        request.addProperty("p_materno", requestKaizen.getP_materno());
        request.addProperty("p_genero", requestKaizen.getP_genero());
        request.addProperty("p_fecha", requestKaizen.getP_fecha());
        request.addProperty("p_tipper", requestKaizen.getP_tipper());
        request.addProperty("p_calle", requestKaizen.getP_calle());
        request.addProperty("p_numero", requestKaizen.getP_numero());
        request.addProperty("p_colonia", requestKaizen.getP_colonia());
        request.addProperty("p_cp", requestKaizen.getP_cp());
        request.addProperty("p_email", requestKaizen.getP_email());
        CRMResponse respuesta = (CRMResponse) servis.getObjResponse(direction, request.toString(), CRMResponse.class);
        return respuesta;
    }


    @Override
    public CRMResponse subirDocumento(String agente, String tipoDoc, String nombreArchivo, String extension,
                                      String dataArchivo, String usuario, String pantalla, String leer, String url) throws CrmServicesException {
        String webservice = "ws_upload";
        String webmethod = "ws_upload";
        String direction = "/PortalCRM/ws_upload";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_leer", leer);
        request.addProperty("p_agente", agente);
        request.addProperty("p_tipo_doc", tipoDoc);
        request.addProperty("p_nombre_archivo", nombreArchivo);
        request.addProperty("p_extension", extension);
        request.addProperty("p_url", url);
        request.addProperty("p_archivo", dataArchivo);
        System.out.println(request.toString());
        CRMResponse respuesta = (CRMResponse) servis.getObjResponse(direction, request.toString(), CRMResponse.class);
        return respuesta;
    }

    @Override
    public CRMResponse eliminarDocumento(String agente, String dataArchivo, String usuario, String pantalla) throws CrmServicesException {
        String webservice = "ws_download";
        String webmethod = "ws_download";
        String direction = "/PortalCRM/ws_borra_archivo";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_agente", agente);
        request.addProperty("p_archivo", dataArchivo);
        CRMResponse respuesta = (CRMResponse) servis.getObjResponse(direction, request.toString(), CRMResponse.class);
        return respuesta;
    }

    @Override
    public ListaArchivo listaDocumentos(String agente, String usuario, String pantalla) throws CrmServicesException {
        String webservice = "ws_listadoc";
        String webmethod = "ws_listadoc";
        String direction = "/PortalCRM/ws_listadoc";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_agente", agente);
        System.out.println(request.toString());
        ListaArchivo respuesta = (ListaArchivo) servis.getObjResponse(direction, request.toString(), ListaArchivo.class);
        return respuesta;
    }

    @Override
    public ListaArchivo descargarDocumento(String agente, String tipoDoc, String usuario, String pantalla) throws CrmServicesException {
        String webservice = "ws_download";
        String webmethod = "ws_download";
        String direction = "/PortalCRM/ws_download";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_agente", agente);
        request.addProperty("p_archivo", tipoDoc);
        System.out.println(request.toString());
        ListaArchivo respuesta = (ListaArchivo) servis.getObjResponse(direction, request.toString(), ListaArchivo.class);
        return respuesta;
    }

    @Override
    public CatalogoMoneda getCatalogoMoneda(String usuario, String pantalla) throws CrmServicesException{
        String codigo = "CATMONEDA";
        String webservice = "WS_CATALOGO";
        String direction = "/PortalCRM/ws_catalogo";
        JsonObject request = new JsonObject();
        request.addProperty("p_codigo", codigo);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webservice", webservice);
        CatalogoMoneda respuesta = (CatalogoMoneda) servis.getObjResponse(direction, request.toString(), CatalogoMoneda.class);
        return respuesta;
    }

    @Override
    public TasaCambio getTasaCambio(String anio, String mes, String usuario, String pantalla) throws CrmServicesException{
        String webservice = "ws_tcmensual";
        String direction = "/PortalCRM/ws_tcmensual";
        JsonObject request = new JsonObject();
        request.addProperty("p_anio", anio);
        request.addProperty("p_mes", mes);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webservice", webservice);
        TasaCambio respuesta = (TasaCambio) servis.getObjResponse(direction, request.toString(), TasaCambio.class);
        return respuesta;
    }

    @Override
    public MovimientosProduccion getReporteProduccionMovimientos(String area, String anio, String mes, String usuario, String pantalla) throws CrmServicesException{
        String webservice = "ws_tcmensual";
        String direction = "/PortalCRM/ws_movimientosprod";
        JsonObject request = new JsonObject();
        request.addProperty("p_area", area);
        request.addProperty("p_anio", anio);
        request.addProperty("p_mes", mes);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webservice", webservice);
        MovimientosProduccion respuesta = (MovimientosProduccion) servis.getObjResponse(direction, request.toString(), MovimientosProduccion.class);
        return respuesta;
    }

    @Override
    public ReporteProduccion getReporteProduccion(String reporte, String area, String anio, String mes, String usuario, String pantalla) throws CrmServicesException{
        String webservice = "ws_tcmensual";
        String direction = "/PortalCRM/ws_reporteprod";
        JsonObject request = new JsonObject();
        request.addProperty("p_reporte", reporte);
        request.addProperty("p_area", area);
        request.addProperty("p_anio", anio);
        request.addProperty("p_mes", mes);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webservice", webservice);
        ReporteProduccion respuesta = (ReporteProduccion) servis.getObjResponse(direction, request.toString(), ReporteProduccion.class);
        return respuesta;
    }

    @Override
    public ClienteResponse getListaCliente (String usuario, String pantalla) throws CrmServicesException{
    	String direction = "/PortalCRM/ws_listadoclientes";
    	String p_webmethod = "ws_listadoc";
    	JsonObject request = new JsonObject();
    	request.addProperty("p_usuario", usuario);
    	request.addProperty("p_pantalla", pantalla);
    	request.addProperty("p_webmethod", p_webmethod);
    	ClienteResponse respuesta = (ClienteResponse) servis.getObjResponse(direction, request.toString(), ClienteResponse.class);
    	return respuesta;
    }

    @Override
    public ClienteInfoResponse getClienteInfo (String usuario, String pantalla, String codigo) throws CrmServicesException{
    	String direction = "/PortalCRM/ws_cliente";
    	String p_webmethod = "ws_cliente";
    	JsonObject request = new JsonObject();
    	request.addProperty("p_usuario", usuario);
    	request.addProperty("p_pantalla", pantalla);
    	request.addProperty("p_webmethod", p_webmethod);
    	request.addProperty("p_codigo", codigo);
    	ClienteInfoResponse respuesta = (ClienteInfoResponse) servis.getObjResponse(direction, request.toString(), ClienteInfoResponse.class);
    	return respuesta;
    }

    @Override
    public SimpleResponse validaRfc (String usuario, String pantalla, String rfc) throws CrmServicesException{
    	String direction = "/PortalCRM/ws_validaRFC";
    	String p_webmethod = "ws_validaRFC";
    	JsonObject request = new JsonObject();
    	request.addProperty("p_usuario", usuario);
    	request.addProperty("p_pantalla", pantalla);
    	request.addProperty("p_webmethod", p_webmethod);
    	request.addProperty("p_rfc", rfc);
    	SimpleResponse respuesta = (SimpleResponse) servis.getObjResponse(direction, request.toString(), SimpleResponse.class);
    	return respuesta;
    }

    @Override
    public SimpleResponse guardaCliente (String usuario, String pantalla, String tipoGuardar, String codigo, String rfc, String curp, int tipper, int regimen,
    		String nombre, String paterno, String materno, int sociedad, String calle, String numExt, String numInt, int colonia, String cp, String email, String telefono,
    		String telefonoadic, String ocupacion, String pais_nac, int dom_mex, int cuenta_pro, String met_pago, int banco, String cuenta,
    		int nacionalidad, String pais_constitucion, String folio_mercantil, String representante_legal, String fecha_constitucion, int giro, String fiel, String estatus, String observaciones)
    		throws CrmServicesException{
    	String direction = "/PortalCRM/ws_insertacliente";
    	String p_webmethod = "ws_insertacliente";
    	JsonObject request = new JsonObject();

    	request.addProperty("p_usuario", usuario);
    	request.addProperty("p_pantalla", pantalla);
    	request.addProperty("p_webmethod", p_webmethod);
    	request.addProperty("p_tipo", tipoGuardar);
    	request.addProperty("p_codigo", codigo);
    	request.addProperty("p_rfc", rfc);
    	request.addProperty("p_curp", curp);
    	request.addProperty("p_tipper", tipper);
        request.addProperty("p_regimen",regimen);
    	request.addProperty("p_nombre", nombre);
    	request.addProperty("p_paterno", paterno);
    	request.addProperty("p_materno", materno);
    	request.addProperty("p_sociedad", sociedad);
    	request.addProperty("p_calle", calle);
    	request.addProperty("p_num_ext", numExt);
    	request.addProperty("p_num_int", numInt);
    	request.addProperty("p_colonia", colonia);
    	request.addProperty("p_cp", cp);
    	request.addProperty("p_email", email);
    	request.addProperty("p_telefono", telefono);
    	request.addProperty("p_telefonoadic", telefonoadic);
    	request.addProperty("p_ocupacion", ocupacion);
    	request.addProperty("p_pais_nac", pais_nac);
    	request.addProperty("p_dom_mex", dom_mex);
    	request.addProperty("p_cuenta_pro", cuenta_pro);
    	request.addProperty("p_met_pago", met_pago);
    	request.addProperty("p_banco", banco);
    	request.addProperty("p_cuenta", cuenta);
    	request.addProperty("p_nacionalidad", nacionalidad);
    	request.addProperty("p_pais_constitucion", pais_constitucion);
    	request.addProperty("p_folio_mercantil", folio_mercantil);
    	request.addProperty("p_representante_legal", representante_legal);
    	request.addProperty("p_fecha_constitucion", fecha_constitucion);
    	request.addProperty("p_actividad", giro);
    	request.addProperty("p_fiel", fiel);
        request.addProperty("p_estatus",estatus);
        request.addProperty("p_observaciones",observaciones);
    	SimpleResponse respuesta = (SimpleResponse) servis.getObjResponse(direction, request.toString(), SimpleResponse.class);
    	return respuesta;
    }

    @Override
    public CometariosClienteResponse getComentariosCliente (String usuario, String pantalla, String codigoCliente) throws CrmServicesException{
        String direction = "/PortalCRM/ws_mensajes";
        String p_webmethod = "ws_insertacliente";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webmethod", p_webmethod);
        request.addProperty("p_codigo", codigoCliente);
        CometariosClienteResponse respuesta = (CometariosClienteResponse) servis.getObjResponse(direction, request.toString(), CometariosClienteResponse.class);
        return respuesta;
    }

    @Override
    public SimpleResponse validaCotizacion (String usuario, String pantalla, String cliente, String canal, String producto, String ejecutivo) throws CrmServicesException{
        String direction = "/PortalCRM/ws_validacotizacion";
        String p_webmethod = "ws_listadoc";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webmethod", p_webmethod);
        request.addProperty("p_cliente", cliente);
        request.addProperty("p_canal", canal);
        request.addProperty("p_producto", producto);
        request.addProperty("p_ejecutivo", ejecutivo);
        SimpleResponse respuesta = (SimpleResponse) servis.getObjResponse(direction, request.toString(), SimpleResponse.class);
        return respuesta;
    }

    @Override
    public FolioResponse generaFolio (String usuario, String pantalla) throws CrmServicesException{
        String direction = "/PortalCRM/ws_generaFolio";
        String p_webmethod = "ws_listadoc";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webmethod", p_webmethod);
        FolioResponse respuesta = (FolioResponse) servis.getObjResponse(direction, request.toString(), FolioResponse.class);
        return respuesta;
    }

    @Override
    public CotizacionResponse obtenerCotizaciones (String usuario, String pantalla, String codigoCliente) throws CrmServicesException{
        String direction = "/PortalCRM/ws_cotizaciones";
        String p_webmethod = "ws_listadoc";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webmethod", p_webmethod);
        request.addProperty("p_cliente",codigoCliente);
        CotizacionResponse respuesta = (CotizacionResponse) servis.getObjResponse(direction, request.toString(), CotizacionResponse.class);
        return respuesta;
    }

    @Override
    public CRMResponse guardaCotizacion (String usuario, String pantalla, String folio,String cliente, String agente,
                                            String producto, String movimiento, String negocio, JsonArray participantes,
                                            String moneda, String fecini, String fecfin, String fecsol, String fecrea,
                                            String control, String email, String gp_flag, String canal, String ejecutivo) throws CrmServicesException{
        String direction = "/PortalCRM/ws_guardaCotizacion";
        //String p_webmethod = "ws_insertacliente";
        JsonObject request = new JsonObject();

        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        //request.addProperty("p_webmethod", p_webmethod);
        request.addProperty("p_folio", folio);
        request.addProperty("p_cliente", cliente);
        request.addProperty("p_agente", agente);
        request.addProperty("p_producto", producto);
        request.addProperty("p_movimiento", movimiento);
        request.addProperty("p_negocio", negocio);
        request.addProperty("p_canal",canal);
        request.addProperty("p_ejecutivo",ejecutivo);
        request.add("p_participantes", participantes);
        request.addProperty("p_moneda", moneda);
        request.addProperty("p_fecini", fecini);
        request.addProperty("p_fecfin", fecfin);
        request.addProperty("p_fecsol", fecsol);
        request.addProperty("p_fecrea", fecrea);
        request.addProperty("p_control", control);
        request.addProperty("p_correo", email);
        request.addProperty("p_gp_flag", gp_flag);

        CRMResponse respuesta = (CRMResponse) servis.getObjResponse(direction, request.toString(), CRMResponse.class);
        return respuesta;
    }

    @Override
    public ClienteParcialResponse obtenerClientesAutoComplete(String usuario, String pantalla, String codigo, String rfc, String nombre, String estatus) throws CrmServicesException {

        String direction = "/PortalCRM/ws_buscaClientes";
        String p_webmethod = "ws_listadoc";
        JsonObject request = new JsonObject();

        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla);
        request.addProperty("p_webmethod", p_webmethod);
        request.addProperty("p_codigo", codigo);
        request.addProperty("p_rfc", rfc);
        request.addProperty("p_nombre", nombre);
        request.addProperty("p_estatus", estatus);

        ClienteParcialResponse respuesta = (ClienteParcialResponse) servis.getObjResponse(direction, request.toString(), ClienteParcialResponse.class);
        return respuesta;
    }

    @Override
    public ListaRegistro getCatalogo(int rownum, String tiptransaccion, String codigo, int activo, String valor, String usuario, String pantalla) throws CrmServicesException {
        String webservice = "WS_CATALOGO";
        String webmethod = "WS_CATALOGO";
        String direction = "/PortalCRM/ws_catalogo";
        JsonObject request = new JsonObject();

        request.addProperty("p_rowNum", rownum);
        request.addProperty("p_tipTransaccion", tiptransaccion);
        request.addProperty("p_codigo", codigo);
        request.addProperty("p_activo", activo);
        request.addProperty("p_valor", valor);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);

        ListaRegistro respuesta = (ListaRegistro) servis.getObjResponse(direction, request.toString(),
                ListaRegistro.class);

        return respuesta;
    }

    @Override
    public ListaParticipantes getListaParticipantes(String usuario, String pantalla, String nombre, String participante, String negocio) throws CrmServicesException {
        String webservice = "ws_listadoc";
        String webmethod = "ws_listadoc";
        String direction = "/PortalCRM/ws_listaParticipantes";
        JsonObject request = new JsonObject();
        request.addProperty("p_nombre", nombre);
        request.addProperty("p_participante", participante);
        request.addProperty("p_negocio", negocio);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);
        ListaParticipantes respuesta = (ListaParticipantes) servis.getObjResponse(direction, request.toString(), ListaParticipantes.class);
        return respuesta;
    }

    @Override
    public RenovacionResponse getRenovacionCotizacion(String usuario, String pantalla, String poliza) throws CrmServicesException {
        String webservice = "ws_listadoc";
        String webmethod = "ws_listadoc";
        String direction = "/PortalCRM/ws_renovacion";
        JsonObject request = new JsonObject();
        request.addProperty("p_poliza",poliza);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);
        RenovacionResponse respuesta = (RenovacionResponse) servis.getObjResponse(direction, request.toString(), RenovacionResponse.class);
        return respuesta;
    }

    @Override
    public FoliosCorreosResponse getFoliosCorreos(String usuario, String pantalla, String codigo) throws CrmServicesException {
        String webservice = "ws_listadoc";
        String webmethod = "ws_listadoc";
        String direction = "/PortalCRM/ws_renovacion";
        JsonObject request = new JsonObject();
        request.addProperty("p_codigo",codigo);
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0,50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);
        FoliosCorreosResponse respuesta = (FoliosCorreosResponse) servis.getObjResponse(direction, request.toString(), FoliosCorreosResponse.class);
        return respuesta;
    }
    
    @Override
    public TramiteResponse getTramitesFiltro(String usuario, String pantalla, String codigoCliente, String agente, String ejecutivo, String folio,
    		String estatus, String fecini, String fecfin) throws CrmServicesException {
        String webservice = "ws_tramites";
        String webmethod = "ws_tramites";
        String direction = "/PortalCRM/ws_tramites";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0,50));
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_cliente",codigoCliente);
        request.addProperty("p_agente" ,agente);
        request.addProperty("p_ejecutivo", ejecutivo);
        request.addProperty("p_folio", folio);
        request.addProperty("p_estatus", estatus);
        request.addProperty("p_fecini", fecini);
        request.addProperty("p_fecfin", fecfin);
        
        TramiteResponse respuesta = (TramiteResponse) servis.getObjResponse(direction, request.toString(), TramiteResponse.class);
        return respuesta;
    }

    @Override
    public ReporteAgentesResponse getReporteAgentes(String usuario, String pantalla, String fechaInicio, String fechaFin, String canal, String filtro) throws CrmServicesException{
        String webservice = "ws_listadoc";
        String webmethod = "ws_listadoc";
        String direction = "/PortalCRM/ws_reporteagentes";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0,50));
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_fec_ini",fechaInicio);
        request.addProperty("p_fec_fin" ,fechaFin);
        request.addProperty("p_canal", canal);
        request.addProperty("p_nombre", filtro);
        ReporteAgentesResponse respuesta = (ReporteAgentesResponse) servis.getObjResponse(direction, request.toString(), ReporteAgentesResponse.class);
        return respuesta;
    }

    @Override
    public ReporteClienteResponse getReporteClientes(String usuario, String pantalla, String fechaInicio, String fechaFin, String canal, String filtro) throws CrmServicesException{
        String webservice = "ws_listadoc";
        String webmethod = "ws_listadoc";
        String direction = "/PortalCRM/ws_reporteclientes";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0,50));
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_fec_ini",fechaInicio);
        request.addProperty("p_fec_fin" ,fechaFin);
        request.addProperty("p_canal", canal);
        request.addProperty("p_nombre",filtro);
        ReporteClienteResponse respuesta = (ReporteClienteResponse) servis.getObjResponse(direction, request.toString(), ReporteClienteResponse.class);
        return respuesta;
    }
    
    @Override
    public PersonasResponse getPersonas(String usuario, String pantalla, String tipo) throws CrmServicesException{
        String webservice = "ws_personas";
        String webmethod = "ws_personas";
        String direction = "/PortalCRM/ws_personas";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0,50));
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_tipo", tipo);
        
        PersonasResponse respuesta = (PersonasResponse) servis.getObjResponse(direction, request.toString(), PersonasResponse.class);
        return respuesta;
    }

    @Override
    public ListaParticipantes wsParticipantes(String usuario, String pantalla, int folio) throws CrmServicesException {
        String webservice = "ws_participantes";
        String webmethod = "ws_participantes";
        String direction = "/PortalCRM/ws_participantes";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0, 50));
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_folio", folio);
        ListaParticipantes respuesta = (ListaParticipantes) servis.getObjResponse(direction, request.toString(), ListaParticipantes.class);
        return respuesta;
    }

    @Override
    public ProduccionPrimaResponse getReporteProduccionPrima(String usuario, String pantalla, String fecha_inicio, String fecha_fin) throws CrmServicesException{
        String webservice = "ws_personas";
        String webmethod = "ws_personas";
        String direction = "/PortalCRM/ws_personas";
        JsonObject request = new JsonObject();
        request.addProperty("p_usuario", usuario);
        request.addProperty("p_pantalla", pantalla.length() <= 50 ? pantalla : pantalla.substring(0,50));
        request.addProperty("p_webmethod", webmethod);
        request.addProperty("p_webservice", webservice);
        request.addProperty("p_fec_ini", fecha_inicio);
        request.addProperty("p_fec_fin", fecha_fin);
        ProduccionPrimaResponse respuesta = (ProduccionPrimaResponse) servis.getObjResponse(direction, request.toString(), ProduccionPrimaResponse.class);
        return respuesta;
    }
}

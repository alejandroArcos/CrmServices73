/**
 * 
 */
package com.tokio.crm.crmservices73.Util;

import com.google.gson.Gson;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.tokio.crm.crmservices73.Exeption.CrmServicesException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author jonathanfviverosmoreno
 *
 */
public class ConsumeServicio {

	private static final Log _log = LogFactoryUtil.getLog(ConsumeServicio.class);
	int contadorPeticion = 0;
	String host = PropsUtil.get("ambiente.configuracion.host");
	String puerto = PropsUtil.get("ambiente.configuracion.puerto");
	
	public <T> Object getObjResponse(String direction, String json, Class<T> cls) throws CrmServicesException {
		// se obtiene servicio
		String response = null;
		try {
			response = getService(direction, json);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CrmServicesException(1, "Error al consultar el servicio");
		}

		// se utiliza libreria json para convertir json a objeto
		Gson gson = new Gson();
		Object obj;
		try {
			obj = cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e1) {
			e1.printStackTrace();
		}
		obj = null;
		if (response != "responseServicio no disponible") {
			try {
				// Se convierte respuesta a objeto
				obj = gson.fromJson(response, cls);
			} catch (Exception e) {
				e.printStackTrace();
				throw new CrmServicesException(2, "Error al convertir json to Object");
			}
		}
		return obj;
	}

	public String getService(String direction, String json) {
		HttpURLConnection connection;
		String uri = "http://" + host + ":" + puerto + direction;
		URL url;

		int contador = contadorPeticion;
		contadorPeticion++;

		try {
			url = new URL(uri);
			_log.info("[pet - " + contador + " ] " + url);
			_log.info("[pet - " + contador + " ] " + json);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Accept", "application/json");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);
			OutputStream os = connection.getOutputStream();
			os.write(json.getBytes());
			os.flush();

			if (connection.getResponseCode() != HttpURLConnection.HTTP_CREATED && connection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + connection.getResponseCode());
			}

			InputStream inputStream = connection.getInputStream();
			String theString = getStringFromInputStream(inputStream);

			connection.disconnect();
			_log.info("[pet - " + contador + " ] " + theString);
			return theString;
		} catch (Exception e) {
			_log.error( "[pet - " + contador + " ] " + e.getMessage() );
			e.printStackTrace();
			return "{\"code\" : 5, \"msg\" : \"Error de red\"}"; // Default error message
		}
	}

	public String getService(String direction) {
		HttpURLConnection connection;
		String uri = "http://" + host + ":" + puerto + direction;
		URL url;

		try {
			url = new URL(uri);
			System.out.println("GETURL" + url);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");

			if (connection.getResponseCode() != HttpURLConnection.HTTP_CREATED && connection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + connection.getResponseCode());
			}

			InputStream inputStream = connection.getInputStream();
			String theString = getStringFromInputStream(inputStream);

			connection.disconnect();
			System.out.println(theString);
			return theString;
		} catch (Exception e) {
			_log.info(e.getMessage());
			e.printStackTrace();

			return "Servicio no disponible"; // Default error message
		}
	}

	private static String getStringFromInputStream(InputStream is) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		String line;

		try {
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}

	public int stringToInt(String val) {
		try {
			return Integer.parseInt(val);
		} catch (Exception e) {
			return 0;
		}
	}
}

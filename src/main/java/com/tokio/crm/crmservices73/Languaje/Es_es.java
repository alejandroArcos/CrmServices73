package com.tokio.crm.crmservices73.Languaje;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.language.UTF8Control;

@Component(
	    property = { "language.id=es_ES" }, 
	    service = ResourceBundle.class
	)

public class Es_es extends ResourceBundle{
	@Override
    protected Object handleGetObject(String key) {
        return _resourceBundle.getObject(key);
    }

    @Override
    public Enumeration<String> getKeys() {
        return _resourceBundle.getKeys();
    }

    private final ResourceBundle _resourceBundle = ResourceBundle.getBundle(
        "content.Language_es_ES", UTF8Control.INSTANCE);
}

package com.tokio.crm.crmservices73.Util;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.InternetHeaders;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Objects;

/**
 * @author jonathanfviverosmoreno
 */
public class SendMail {

    private static final Log _log = LogFactoryUtil.getLog(SendMail.class);

    public static void SendMailOnePersonWithCC(String[] to, String[] cc, String body, String subject) {
        try {
            String fromMail = "portal_agentes@tokiomarine.com.mx";

            MailMessage ms = new MailMessage();
            ms.setFrom(convert(fromMail));
            ms.setCC(Arrays.stream(cc).map(SendMail::convert).filter(Objects::nonNull).toArray(InternetAddress[]::new));
            //ms.setCC(new InternetAddress[] {new InternetAddress("ivan.benitez+cc@globalquark.com.mx")});
            ms.setSubject(subject);
            ms.setBody(body);
            ms.setHTMLFormat(true);
            ms.setTo(Arrays.stream(to).map(SendMail::convert).filter(Objects::nonNull).toArray(InternetAddress[]::new));
            //TODO Habilitar MailService
            MailServiceUtil.sendEmail(ms);
            _log.info("------Enviando email:--------");
            _log.info("to     :" + Arrays.asList(ms.getTo()));
            _log.info("cc     :" + Arrays.asList(ms.getCC()));
            _log.info("subject:" + ms.getSubject());
            _log.info("msg    :" + ms.getBody());
            _log.info("-----------------------------");
            _log.info("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static InternetAddress convert(String mail) {
        try {
            return new InternetAddress(mail);
        } catch (AddressException e) {
            return null;
        }
    }


}

package com.tokio.crm.crmservices73.Util;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;

import java.io.File;
import java.util.Properties;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.AddressException;

public class SendMailJavaMail {
	private static final Log _log = LogFactoryUtil.getLog(SendMailJavaMail.class);
	
	private String[] toMail;
	private String fromMail;
	private MailMessage mailMessage;
	private String body;
	private String subject;
	private Message message;
	private Session session;
	private Multipart multipart;
	
	public SendMailJavaMail(String[] toMail) {
		super();
		this.toMail = toMail;
		this.fromMail = PropsUtil.get("ambiente.configuracion.mail");
		this.mailMessage = new MailMessage();
		
		//Solucion alternativa
		final String fromEmail = "tmx@tokiomarine.com.mx"; //requires valid gmail id
		final String password = "Abcde123456"; // correct password for gmail id

		//final String fromEmail = "erick851@hotmail.es"; //requires valid gmail id
		//final String password = "Erick2011030037"; // correct password for gmail id

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.office365.com");
		props.put("mail.smtp.port", "587");
		
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		
		this.session = Session.getInstance(props, auth);
		this.multipart = new MimeMultipart();
		this.message = new MimeMessage(session);
		this.fromMail = fromEmail;
	}
	
	/*
	public boolean send(){
		InternetAddress fromAddress = null;
		
		try {
			
			System.out.println(fromMail);
			
			fromAddress = new InternetAddress(this.fromMail);

			mailMessage.setFrom(fromAddress);
			mailMessage.setSubject(subject);
			mailMessage.setBody(body);
			mailMessage.setHTMLFormat(true);
	
			InternetAddress[] bulkAddresses = new InternetAddress[ this.toMail.length ];
			for (int i=0; i<this.toMail.length; i++) {
				bulkAddresses [i] = new InternetAddress( this.toMail[i] );
			}
			mailMessage.setBulkAddresses(bulkAddresses);
			MailServiceUtil.sendEmail(mailMessage);

		} catch (AddressException e) {
			e.printStackTrace();
		}
		return true;
	}
	*/
	
	public boolean send() {
		try {
			
			InternetAddress[] to = new InternetAddress[toMail.length];
			for(int contAux = 0; contAux < toMail.length; contAux++) {
				to[contAux] = new InternetAddress(toMail[contAux]);
			}
			
			// Set From: header field of the header.
			message.setFrom(new InternetAddress(this.fromMail));
			
			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO,to);
			
			// Set Subject: header field
			message.setSubject(subject);
			
			// Send the complete message parts
			message.setContent(multipart);
			
			Thread.currentThread().setContextClassLoader(javax.mail.Message.class.getClassLoader());
			
			if(!Boolean.parseBoolean(PropsUtil.get("ambiente.configuracion.mail.active"))) {
				Transport.send(message);
				
				System.out.println(PropsUtil.get("ambiente.configuracion.mail.active"));
				
				System.out.println("Sent message successfully....");
			}
			
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}catch (Exception e){
			e.printStackTrace();
		}

		return true;
	}
	
	/*
	public void addFile(File file, String filename){
		mailMessage.addFileAttachment(file, filename);
	}
	*/
	
	public void addBody() {
		try {
			BodyPart htmlBodyPart = new MimeBodyPart(); //4
			htmlBodyPart.setContent(body , "text/html; charset=utf-8");
			
			multipart.addBodyPart(htmlBodyPart);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addFile(File file, String filename) {
			
		try {	
			// Create the message part
			BodyPart messageBodyPart = new MimeBodyPart();
			
			// Part two is attachment
			messageBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(file);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
		}
		catch(Exception e) {
			System.err.println("Error durante la carga de archivo");
			e.printStackTrace();
		}	
	}
	
	public void addImage(File file, long fileEntryId) {
		
		try {
			
			MimeBodyPart imagePart = new MimeBodyPart();
			imagePart.setHeader("Content-ID", "<" + fileEntryId + ">");
			imagePart.setDisposition(MimeBodyPart.INLINE);
			// attach the image file
			imagePart.attachFile(file);
			
			multipart.addBodyPart(imagePart);
		}
		catch(Exception e) {
			System.err.println("Error durante la carga de archivo");
			e.printStackTrace();
		}
	}
	
	public String[] getToMail() {
		return toMail;
	}
	public void setToMail(String[] toMail) {
		this.toMail = toMail;
	}
	public String getFromMail() {
		return fromMail;
	}
	public void setFromMail(String fromMail) {
		this.fromMail = fromMail;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setMailCC(List<String> mails) throws MessagingException {
		message.setRecipients(Message.RecipientType.CC,convertAddress(mails));
	}

	private Address[] convertAddress(List<String> addresses) throws AddressException {
		if (addresses == null) {
			return null;
		}
		Address[] result=new Address[addresses.size()];
		for (int i=0; i < addresses.size(); i++) {
			result[i]=new InternetAddress(addresses.get(i));
		}
		return result;
	}
}

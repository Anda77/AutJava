/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworkcontentspeed.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.apache.commons.io.IOUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

public class SendEmailAtachament {

    public static void sendGRUP(String from, String password, String bcc, String sub, String msg, String filename) throws Exception {
        //Get properties object    
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session   
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
        //compose message    
        try {
            MimeMessage message = new MimeMessage(session);
            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc));

            message.setSubject(sub);
            message.setText(msg);

            BodyPart messageBodyPart = new MimeBodyPart();

            messageBodyPart.setText("Raport teste automat");

            Multipart multipart = new MimeMultipart();

            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();

//             DataSource source = new FileDataSource(filename);

//             messageBodyPart.setDataHandler(new DataHandler(source));

//             messageBodyPart.setFileName(filename);

//             multipart.addBodyPart(messageBodyPart);

//             //message.setContent(multipart);
//             StringWriter writer = new StringWriter();
//             IOUtils.copy(new FileInputStream(new File(filename)), writer);

//             message.setContent(writer.toString(), "text/html");

            //send message  
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    public static void SendEmailSephoraPassed(String adresaSephora, String from, String grupTestContent, String grupSephora, String subject, String filename) throws FileNotFoundException, IOException {

        //Get properties object    
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session   
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "anda.cristea");
            }
        });
        //compose message    
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(grupTestContent));
            message.addRecipient(Message.RecipientType.BCC, new InternetAddress(grupSephora));

            message.setSubject(subject);
            // message.setText(msg);

            BodyPart messageBodyPart = new MimeBodyPart();

            messageBodyPart.setText("Raport teste automate");

            Multipart multipart = new MimeMultipart();

            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();

            DataSource source = new FileDataSource(filename);

            messageBodyPart.setDataHandler(new DataHandler(source));

            messageBodyPart.setFileName(filename);

            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            //send message  
            Transport.send(message);
            //  System.out.println("message sent successfully");
        } catch (Exception ex) {
            System.out.println("eroare trimitere email-uri");
            System.out.println(ex.getMessage());

        }

    }



    public static void SendEmailPassed(String from, String to1, String subject, String filename) throws FileNotFoundException, IOException {

        try {

            //Get properties object    
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            //get Session   
            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, "andacristea72");
                }
            });
            //compose message    
            try {
                MimeMessage message = new MimeMessage(session);
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to1));
                //message.addRecipient(Message.RecipientType.BCC, new InternetAddress(grupSephora));

                message.setSubject(subject);
                // message.setText(msg);

                BodyPart messageBodyPart = new MimeBodyPart();

                messageBodyPart.setText("Raport teste automate");

                Multipart multipart = new MimeMultipart();

                multipart.addBodyPart(messageBodyPart);

//                 messageBodyPart = new MimeBodyPart();

//                 DataSource source = new FileDataSource(filename);

//                 messageBodyPart.setDataHandler(new DataHandler(source));

//                 messageBodyPart.setFileName(filename);

//                 multipart.addBodyPart(messageBodyPart);

//                 message.setContent(multipart);

                //send message  
                Transport.send(message);
                System.out.println("message sent successfully");
            } catch (Exception ex) {
                System.out.println("eroare trimitere email-uri");
                System.out.println(ex.getMessage());

            }

        } catch (Exception ex) {
           
            System.out.println("eroare trimitere email-uri " + ex.getMessage());

        }

    }

    public static void SendEmailAnda(String from, String to1, String subject, String filename) throws FileNotFoundException, IOException {
        //Get properties object    
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session   
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "anda.cristea");
            }
        });
        //compose message    
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to1));

            message.setSubject(subject);
            // message.setText(msg);

            BodyPart messageBodyPart = new MimeBodyPart();

            messageBodyPart.setText("Raport teste automate");

            Multipart multipart = new MimeMultipart();

            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();

            DataSource source = new FileDataSource(filename);

            messageBodyPart.setDataHandler(new DataHandler(source));

            messageBodyPart.setFileName(filename);

            multipart.addBodyPart(messageBodyPart);

            //message.setContent(multipart);
            
            StringWriter writer = new StringWriter();
            IOUtils.copy(new FileInputStream(new File(filename)), writer);

            message.setContent(writer.toString(), "text/html");

            //send message  
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    public static void SendEmail(String from, String to1, String to2, String subject, String filename) throws FileNotFoundException, IOException {

        try {

            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(filename);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);

            attachment.setDescription("rezultat TC-uri");
            attachment.setName("rezultat TC-uri");

            MultiPartEmail email = new MultiPartEmail();

            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(465);
            //email.setAuthenticator(new DefaultAuthenticator("test@contentspeed.ro", "andaanda"));
            email.setAuthenticator(new DefaultAuthenticator("anda.cristea@contentspeed.ro", "anda.cristea"));
            email.setSSLOnConnect(true);

            email.addBcc(to1);
            email.addBcc(to2);
            email.setFrom(from, "Teste Automate");
            email.setSubject(subject);
            email.setMsg(subject);

            // add the attachment
            //email.attach(attachment);
            StringWriter writer = new StringWriter();
            IOUtils.copy(new FileInputStream(new File(filename)), writer);

            email.setContent(writer.toString(), "text/html");
            email.attach(attachment);

            // send the email
            email.send();
            writer.close();
        } catch (Exception ex) {
            System.out.println("eroare trimitere email-uri");
            System.out.println(ex.getMessage());

        }

    }

   

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {
            System.out.println("=======send email start");

            // nu a mers 
            SendEmailSephoraPassedJava("anda72cristea@gmail.com", "andadeacu@yahoo.com", "Teste email-uri Sephora", "");
           

            System.out.println("=======end email");
        } catch (Exception ex) {
            //  ex.getMessage();
            ex.printStackTrace();
        }

    }

}

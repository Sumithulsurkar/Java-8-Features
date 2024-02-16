
package com.email.util;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;

public class EmailUtility {

    public static void main(String[] args) {
        //from,password,to,subject,message
        Mailer.send("samruddhipathe@gmail.com","erwcghhvpdyvgcix","spathe96@gmail.com","hello javatpoint","How r u?");
        //change from, password and to
    }
}

class Mailer{
    public static void send(String from,String password,String to,String sub,String msg){

        String chartConfig = "{" +
                "\"type\": \"line\"," +
                "\"data\": {" +
                "\"labels\": [2012, 2013, 2014, 2015, 2016]," +
                "\"datasets\": [{" +
                "\"label\": \"Users\"," +
                "\"data\": [120, 60, 50, 180, 120]" +
                "}]" +
                "}" +
                "}";

        String chartUrl =
                "https://quickchart.io/chart?width=500&height=200&chart=" +
                        URLEncoder.encode(chartConfig, StandardCharsets.UTF_8);

        String message1 =
                "<!DOCTYPE html><html><head></head><body>"+"<p>Hello, please see the chart below:</p>"+"<br><br><img src=\"" + chartUrl + "\"></body></html>";


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
                        return new PasswordAuthentication(from,password);
                    }
                });
        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
            message.setContent(message1,"text/html" );
            //send message
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {throw new RuntimeException(e);}
    }
}

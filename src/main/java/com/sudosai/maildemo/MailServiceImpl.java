package com.sudosai.maildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    JavaMailSender mailSender;

    @Override
    public void sendEmail(Mail mail) {
        MimeMessage message = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            message.setSubject(mail.getSubject());
            message.setFrom(new InternetAddress(mail.getSender(), "John Doe"));

            Address[] addresses = new Address[mail.getReceivers().size()];
            for (int i = 0; i < addresses.length; ++i) {
                addresses[i] = new InternetAddress(mail.getReceivers().get(i));
            }
            message.setRecipients(Message.RecipientType.TO, addresses);

            message.setSubject(mail.getSubject());
            message.setText(mail.getContent());

            mailSender.send(helper.getMimeMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

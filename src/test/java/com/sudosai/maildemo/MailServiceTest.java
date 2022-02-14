package com.sudosai.maildemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void sendMail() {
        Mail mail = new Mail();
        mail.setSender("xyz@outlook.com");

        List<String> r = new ArrayList<>();
        mail.setReceivers(List.of("xyz@gmail.com"));
        mail.setSubject("Test Subject");
        mail.setContent("Test Content");

        mailService.sendEmail(mail);
    }
}
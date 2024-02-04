package ru.example.mail_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import ru.example.mail_service.api.MailDto;

@Component
@RequiredArgsConstructor
public class MailSenderService {
    private final JavaMailSender javaMailSender;

    public void sendEmail(MailDto dto) {
        var email = new SimpleMailMessage();
        email.setText(concatTextEmail(dto));
        email.setTo(dto.getEmail());
        email.setSubject(dto.getSubject());
        javaMailSender.send(email);
        //Ateezz082@mail.ru
    }

    private String concatTextEmail(MailDto dto) {
        return "Уважаемый(ая) "+ dto.getName() + " " + dto.getLastName() + " " + dto.getText();
    }
}

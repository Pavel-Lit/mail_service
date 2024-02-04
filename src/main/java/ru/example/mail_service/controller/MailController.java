package ru.example.mail_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.example.mail_service.api.MailDto;
import ru.example.mail_service.service.MailSenderService;

@RestController
@RequiredArgsConstructor
public class MailController {
    private final MailSenderService service;

    @PostMapping("/send")
    public void send(@RequestBody MailDto dto) {
        service.sendEmail(dto);
    }

}

package ru.example.mail_service.api;

import lombok.Getter;

@Getter
public class MailDto {
    private String email;
    private String name;
    private String lastName;
    private String text;
    private String subject;
}

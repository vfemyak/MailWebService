package com.epam.model;

import com.opencsv.bean.CsvBindByName;

public class Letter {

    @CsvBindByName
    private String email;

    @CsvBindByName
    private String subject;

    @CsvBindByName
    private String body;

    public Letter() {
    }

    public Letter(String email, String subject, String body) {
        this.email = email;
        this.subject = subject;
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

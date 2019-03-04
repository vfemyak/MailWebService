package com.epam.endpoint;

import com.epam.model.Letter;
import com.epam.web.soap.MailWebServiceImpl;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailWebServicePublisher {
    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
//        List<Letter> lists = new ArrayList<>();
//
//        MailWebServiceImpl mailWebService = new MailWebServiceImpl();
//        lists = mailWebService.getAllLetters();
//
//        System.out.println(lists);

//        List<Letter> list = new ArrayList<>();
//        List<Letter> listget = new ArrayList<>();
//
//        MailWebServiceImpl mailWebService = new MailWebServiceImpl();
//        mailWebService.sendLetter(new Letter("cdsc","cdsv","vbbfd"));
//        mailWebService.sendLetter(new Letter("cdddsc","cvdfdsv","vbfddbfd"));
//        mailWebService.sendLetter(new Letter("cfdsc","cdsvgg","vbbgfd"));
//
//        mailWebService.deleteLetterBySubject("cdsv");
//
//        //listget = mailWebService.getLetterBySubject("cdsv");
//
//        list = mailWebService.getAllLetters();
//        for (Letter o : list) {
//            System.out.println(o.toString());
//        }
        Endpoint.publish("http://localhost:8080/wss/mail_service", new MailWebServiceImpl());
    }
}

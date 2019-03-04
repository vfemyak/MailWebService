package com.epam.web.soap;

import com.epam.model.Letter;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.util.List;

@WebService
public interface MailWebService {
    @WebMethod
    void sendLetter(Letter letter) throws CsvRequiredFieldEmptyException, IOException, CsvDataTypeMismatchException;
    @WebMethod
    List<Letter> getAllLetters() throws IOException;
    @WebMethod
    void deleteLetterBySubject(String subj);
    @WebMethod
    List<Letter> getLetterByEmail(String email);
    @WebMethod
    List<Letter> getLetterBySubject(String subj);
}

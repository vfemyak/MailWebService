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
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use= SOAPBinding.Use.LITERAL)
public interface MailWebService {

    void sendLetter(Letter letter) throws CsvRequiredFieldEmptyException, IOException, CsvDataTypeMismatchException;
    List<Letter> getAllLetters() throws IOException;
    void deleteLetterBySubject(String subj);
    List<Letter> getLetterByEmail(String email);
    List<Letter> getLetterBySubject(String subj);
}

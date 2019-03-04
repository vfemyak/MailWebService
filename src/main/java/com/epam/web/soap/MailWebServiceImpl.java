package com.epam.web.soap;

import com.epam.BO.LetterBO;
import com.epam.model.Letter;
import com.epam.web.soap.MailWebService;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.apache.log4j.Logger;

import javax.jws.WebService;
import java.io.IOException;
import java.util.List;

@WebService(endpointInterface = "com.epam.web.soap.MailWebService")
public class MailWebServiceImpl implements MailWebService {
    private Logger LOGGER = Logger.getLogger(MailWebService.class);
    private final static LetterBO letterBO = new LetterBO();

    public MailWebServiceImpl() throws IOException {
    }

    public void sendLetter(Letter letter) {
        letterBO.sendLetter(letter);
    }

    public List<Letter> getAllLetters() {
        return letterBO.getAllLetters();
    }

    public void deleteLetterBySubject(String subj) {
        letterBO.deleteLetterBySubject(subj);
    }

    public List<Letter> getLetterByEmail(String email) {
        return letterBO.getLetterByEmail(email);
    }

    public List<Letter> getLetterBySubject(String subj) {
        return letterBO.getLetterBySubject(subj);
    }
}

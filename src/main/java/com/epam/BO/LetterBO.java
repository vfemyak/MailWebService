package com.epam.BO;

import com.epam.data_readers.CsvDataReader;
import com.epam.model.Letter;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class LetterBO {

    private static List<Letter> letters = new ArrayList<>();

    public LetterBO() {
        try {
            initLetterFromCsv();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendLetter(Letter letter) {
        letters.add(letter);
    }

    public List<Letter> getAllLetters() {
        return letters;
    }

    public void initLetterFromCsv() throws IOException {
        CsvDataReader dataReader = new CsvDataReader();
        letters = dataReader.findAll();
    }

    public void deleteLetterBySubject(String subj) {
        boolean isRemoved = false;

        for (int i = 0; i < letters.size(); i++) {
            if (letters.get(i).getSubject().toLowerCase().contains(subj)) {
                letters.remove(i);
                isRemoved = true;
            }
        }

        if (!isRemoved)
            System.out.println("There are no such letters");
    }

    public List<Letter> getLetterByEmail(String email) {
        boolean isAdd = false;
        List<Letter> letterList = new ArrayList<>();

        for (Letter letter : letters) {
            if (letter.getEmail().contains(email)) {
                letterList.add(letter);
                isAdd = true;
            }
        }

        if (!isAdd)
            System.out.println("There are no such letters");

        return letterList;
    }

    public List<Letter> getLetterBySubject(String subj) {
        boolean isAdd = false;
        List<Letter> letterList = new ArrayList<>();

        for (Letter letter : letters) {
            if (letter.getSubject().contains(subj)) {
                letterList.add(letter);
                isAdd = true;
            }
        }

        if (!isAdd)
            System.out.println("There are no such letters");

        return letterList;
    }
}

package com.epam.data_readers;

import com.epam.model.Letter;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvDataReader implements DataSourceReader{

    private final static String USERS_DATA_CSV_FILE = "src/test/test_data/users_data.csv";

    public CsvDataReader() {
    }

    @Override
    public List<Letter> findAll() throws IOException {
        List<Letter> letters = new ArrayList<>();
        try {
            letters = new CsvToBeanBuilder(new FileReader("src/main/resources/letters.csv")).withType(Letter.class)
                    .build().parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return letters;
    }
}

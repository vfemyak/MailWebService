package com.epam.data_readers;

import java.io.IOException;
import java.util.List;

public interface DataSourceReader<T> {
    List<T[]> findAll() throws IOException;
}

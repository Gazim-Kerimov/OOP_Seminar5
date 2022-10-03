package filemanager;

import cardlist.CardList;

import java.io.*;

public class FileImport {
    BufferedReader reader;
    Converter converter;
    public FileImport() throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(FilePath.getPath()));
        converter = new Converter();
    }
    public void read() throws IOException {
            String line = reader.readLine();
            while (line != null) {
                CardList.getInstance().addCard(converter.convertToCard(line));
                line = reader.readLine();
            }
            reader.close();
    }
}

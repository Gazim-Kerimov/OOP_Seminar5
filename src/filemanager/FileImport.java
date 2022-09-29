package filemanager;

import cardlist.CardList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileImport {
    BufferedReader reader;
    public FileImport() throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(FilePath.getPath()));
    }
    public void read() throws IOException {
        String line = reader.readLine();
        while (line != null){
            CardList.getInstance().addCard(line);
            line = reader.readLine();
        }
        reader.close();
    }
}

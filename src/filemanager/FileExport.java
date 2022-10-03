package filemanager;

import cardlist.CardList;
import profilecard.Card;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileExport {
    BufferedWriter writer;

    public FileExport(){

    }
    public void exportList() throws IOException {
        writer = new BufferedWriter(new FileWriter(FilePath.getPath()));
        ArrayList<Card> list = CardList.getInstance().getList();
        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i).toString();
            writer.write(line + "\n");
        }
        writer.flush();
        writer.close();
        System.out.println("Данные успешно выгружены в файл");
    }
}

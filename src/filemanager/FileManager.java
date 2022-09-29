package filemanager;

import cardlist.CardList;
import profilecard.UserInput;

import java.io.IOException;

public class FileManager implements UserInput {
    FileImport importer;
    FileExport exporter;
    public FileManager() throws IOException {
        importer = new FileImport();
        exporter = new FileExport();
    }
    public void manage() throws IOException {
        System.out.println("1 - Для импорта данных из файла в программу\n" +
                "2 - Для экспорта данных из программы в файл");
        String userChoice = reader.readLine();
        if(userChoice.equals("1")){
            importer.read();
        }
        else if(userChoice.equals("2")){
            exporter.exportList(CardList.getInstance().getList());
        }
        else System.out.println("Введен некорректный запрос");
    }
}

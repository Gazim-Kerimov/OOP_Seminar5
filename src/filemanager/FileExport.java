package filemanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileExport {
    BufferedWriter writer;

    public FileExport() throws IOException {
        writer = new BufferedWriter(new FileWriter(FilePath.getPath(), true));
    }
    public void exportList(ArrayList<String> list) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);
            writer.write(line + "\n");
        }
        writer.flush();
        writer.close();
    }
}

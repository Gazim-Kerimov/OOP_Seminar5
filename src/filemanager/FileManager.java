package filemanager;
import profilecard.UserInput;
import java.io.IOException;

public class FileManager implements UserInput {
    public FileImport importer;
    FileExport exporter;
    public FileManager() throws IOException {
        importer = new FileImport();
        exporter = new FileExport();
    }
    public void manage() throws IOException {
            exporter.exportList();
    }
}

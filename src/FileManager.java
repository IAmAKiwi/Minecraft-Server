import java.io.File;

public class FileManager {
    private File f;

    public FileManager(File f) {
        this.f = f;
    }


    // Getters and Setters
    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

}

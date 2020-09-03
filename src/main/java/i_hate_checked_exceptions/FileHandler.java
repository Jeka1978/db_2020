package i_hate_checked_exceptions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Evgeny Borisov
 */
public class FileHandler {
    public void handleFile(File file) {
        if (file.exists()) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                fileOutputStream.write(1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

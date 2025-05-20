package FileHandling;

import java.io.*;
import java.io.IOException;

public class file_handling {
    public static void main(String[] args) throws IOException {
        File f = new File("sample.txt");

        if (f.createNewFile()) {
            System.out.println("New file created");
        } else {
            System.out.println("Old file used");
        }

        Writer write = new FileWriter(f);
        write.write("First learning of file handling");
        write.close();
    }
}
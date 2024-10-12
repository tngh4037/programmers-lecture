package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

    public static void main(String[] args) {

        try {
            String fileName = "programTest.txt";
            String pasteName = "programTest_copy.txt";

            FileInputStream filein = new FileInputStream(fileName);
            FileOutputStream fileout = new FileOutputStream(pasteName);

            int readByteCount;
            byte[] buffer = new byte[20];

            while ((readByteCount = filein.read(buffer)) != -1) {
                fileout.write(buffer, 0, readByteCount);
            }
            fileout.flush();

            filein.close();
            fileout.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

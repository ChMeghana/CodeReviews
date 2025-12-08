package org.example.basics;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\Sohi\\temp\\Altair.txt");
            fw.write("Altair Technologies");
            fw.close();
            System.out.println("File created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

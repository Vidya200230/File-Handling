package com.tripillar.filehandling.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String filePath = "output.txt";  // Specify your file path here
        String content = "This is a sample text written to the file.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Text written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

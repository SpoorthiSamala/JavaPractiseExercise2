package com.stackroute.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchingFileExtension {

    public static void main(String args[]) //Searching the given File Extension
    {
        giveTheListOfFilesInTheFolder();
    }

    public static void giveTheListOfFilesInTheFolder() {
        File folder = new File("src/main/java/com/stackroute/junit");
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        try {
            byte[] fileContent = Files.readAllBytes(Paths.get("src/main/java/com/stackroute/junit/" + fileName));
            String content = new String(fileContent);
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

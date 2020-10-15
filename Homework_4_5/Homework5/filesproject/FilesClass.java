package Homework5.filesproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesClass {
    public FilesClass() {
        File file = new File("myFiles");
        if (!file.exists()) {
            System.out.println(file.mkdir());
        }
    }

    public void addNumsInFile() {
        FileWriter file;
        try {
            file = new FileWriter("myFiles/data.txt");
            file.write(29 + "\n" + 39 + "\n" + (-90));
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addInRangeNumsInFile() {
        FileWriter file;
        try {
            file = new FileWriter("myFiles/data1.txt");
            for (int i = 0; i < 100; i++) {
                file.write(i + "\n");
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addMultipleFiles() {
        File folder = new File("myFiles1");
        if (!folder.exists()) {
            System.out.println(folder.mkdir());
        }


        try {
            for (int i = 0; i < 30; i++) {
                FileWriter file = new FileWriter("myFiles1/file" + i + ".txt");
                file.write("Programmer");
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addMultipleFilesWithTexts() {
        File fold = new File("myFiles2");
        if (!fold.exists()) {
            System.out.println(fold.mkdir());
        }

        try {
            for (int i = 0; i < 30; i++) {
                FileWriter file = new FileWriter("myFiles2/file" + i + ".txt");
                file.write("Programmer" + i);
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

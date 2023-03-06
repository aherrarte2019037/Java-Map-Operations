package com.map_operations;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    private static FileReader instance;
    private String path = "./src/main/java/com/map_operations/resources/";

    private FileReader(String filename) {
        this.path = this.path.concat(filename);
    }

    public static FileReader getInstance(String filename) {
        if (instance == null) {
            instance = new FileReader(filename);
        }

        return instance;
    }

    public ArrayList<String> readData() {
        final ArrayList<String> expressions = new ArrayList<String>();

        try {
            File file = new File(path);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                expressions.add(sc.nextLine().trim().replace(" ", ""));

            sc.close();
            return expressions;

        } catch (Exception e) {
            return expressions;
        }
    }
}

package com.map_operations;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.javatuples.Pair;

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
        final ArrayList<String> data = new ArrayList<String>();

        try {
            File file = new File(path);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                data.add(sc.nextLine().trim());

            sc.close();
            return data;

        } catch (Exception e) {
            return data;
        }
    }

    public Pair<String, String> separateRawItem(String rawItem) {
        String[] item = rawItem.split("\\|");
        return Pair.with(item[0], item[1]);
    }
}

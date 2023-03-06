package com.map_operations;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import org.javatuples.Pair;

public class App {
    public static void main(String[] args) {
        MapImplementation mapImplementation;
        MapFactory<String, String> mapFactory = new MapFactory<String, String>();
        FileReader fileReader = FileReader.getInstance("data.txt");
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map;
        ArrayList<String> data = fileReader.readData();
        int opcion = 1;
        System.out.print("\n1. HashMap \n2. TreeMap \n3. LinkedHashMap \n4. Salir \nIngresa tu opcion aquí: ");

        try {
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: {
                    mapImplementation = MapImplementation.HashMap;
                    map = mapFactory.getMap(mapImplementation);

                    for (int index = 0; index < data.size(); index++) {
                        Pair<String, String> card = fileReader.separateRawItem(data.get(index));
                        map.put(card.getValue0(), card.getValue1());
                    }

                    break;
                }

                case 2: {
                    mapImplementation = MapImplementation.TreeMap;
                    map = mapFactory.getMap(mapImplementation);

                    for (int index = 0; index < data.size(); index++) {
                        Pair<String, String> card = fileReader.separateRawItem(data.get(index));
                        map.put(card.getValue0(), card.getValue1());
                    }

                    break;
                }

                case 3: {
                    mapImplementation = MapImplementation.LinkedHashMap;
                    map = mapFactory.getMap(mapImplementation);

                    for (int index = 0; index < data.size(); index++) {
                        Pair<String, String> card = fileReader.separateRawItem(data.get(index));
                        map.put(card.getValue0(), card.getValue1());
                    }

                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Opcion incorrecta, intenta otra vez");
            scanner.next();
        }

        scanner.close();
        System.out.println("Bye ;)");
    }
}

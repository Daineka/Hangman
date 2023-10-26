package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ChoiceSecretWord {
    private static final List<String> dictionaryList = readDictionary();
    private static final Random random = new Random();

    public static String choiceSecretWord() {
        return dictionaryList.get(random.nextInt(dictionaryList.size()));
    }

    private static List<String> readDictionary() {
        String path = "resources/Dictionary.txt";
        File file = new File(path);
        List<String> dictionaryList = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                dictionaryList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                assert scanner != null;
                scanner.close();
            } catch (NullPointerException e) {
                System.out.println("Error: " + e);
            }
        }
        return dictionaryList;
    }
}

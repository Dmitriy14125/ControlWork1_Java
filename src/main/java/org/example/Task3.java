package org.example;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Task3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("1.txt");
        FileWriter fileWriter = new FileWriter("2.txt");
        Scanner scanner = new Scanner(fileReader);
        Set<String> setWords = new HashSet<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            for (String word : words) {
                word = word.toLowerCase();
                setWords.add(word);
            }
        }
        fileWriter.write(setWords.toString());
        fileWriter.flush();
        System.out.println(setWords);
    }
}

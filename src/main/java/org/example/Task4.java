package org.example;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, String> telephonesJournal = new HashMap<>();
        FileReader reader = new FileReader("4.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(" ");
            String Name = line[1] + " " + line[2] + " " + line[3] + " ";
            String number = line[0];
            if (telephonesJournal.containsKey(Name)) {
                String telephoneNumbers = telephonesJournal.get(Name);
                telephoneNumbers = number + " " + telephoneNumbers;
                telephonesJournal.put(Name, telephoneNumbers);
            }
            else {
                telephonesJournal.put(Name, number);
            }
        }
        System.out.println(telephonesJournal);
    }
}

package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] words = s1.split(" ");
        for (String word : words) {
            if (word.indexOf('A') == 0){
                word = word.replace('A','a');
                System.out.println(word);
                count++;
            }
            else {
                System.out.println(word);
                continue;
            }
        }
        System.out.println("Количество слов на букву a = " + count);
    }
}

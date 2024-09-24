package org.example;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxxLenStr = 1;
        int countCurrStr = 1;
        for (int i = 0; i < str.length()-1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if (ch1 <= ch2) {
                countCurrStr++;
            }
            else {
                if (countCurrStr >= maxxLenStr) {
                    maxxLenStr = countCurrStr;
                }
                countCurrStr = 1;
            }

        }
        System.out.println(maxxLenStr);
    }
}

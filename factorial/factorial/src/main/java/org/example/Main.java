package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What number would you like the factorial of? ");
        String userNumberChoice = userInput.nextLine();
        long userNumberChoiceAsInt = Long.parseLong(userNumberChoice);

        long runningFactorial = 1;

        for (int i = 1; i <= userNumberChoiceAsInt; i++) {
            runningFactorial *= i;
        }
        System.out.printf(Locale.US, "The factorial of %,d is %,d.\n", userNumberChoiceAsInt, runningFactorial);
    }


}
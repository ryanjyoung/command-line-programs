package org.example;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("~~~~~ Welcome to the factorial calculator! ~~~~~");
        System.out.print("What number would you like the factorial of? ");
        BigDecimal userChoice = userInput.nextBigDecimal();

        factorial(userChoice);

    }

    public static void factorial(BigDecimal userChoice) {
        BigDecimal runningValue = BigDecimal.ONE;
        for (int i = 1; BigDecimal.valueOf(i).compareTo(userChoice) <= 0; i++) {
            runningValue = runningValue.multiply(BigDecimal.valueOf(i));
        }
        System.out.printf(Locale.US, "The factorial of %,.0f is %,.0f.\n", userChoice, runningValue);
    }


}
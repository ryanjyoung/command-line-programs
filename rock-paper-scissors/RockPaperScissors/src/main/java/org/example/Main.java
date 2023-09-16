package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors!");

        int computerSelection = (int) (Math.random() * 3) + 1;
        System.out.println(computerSelection); // Checking computer selection

        System.out.println("1: Rock");
        System.out.println("2: Paper");
        System.out.println("3: Scissors");

        System.out.print("What is your choice? ");
        String userChoice = userInput.nextLine();

        int userChoiceAsInt = Integer.parseInt(userChoice);

        if (userChoiceAsInt == computerSelection) {
            System.out.println("It's a tie!");
        } else if ((userChoiceAsInt == 1 && computerSelection == 3) || (userChoiceAsInt == 2 && computerSelection == 1) || (userChoiceAsInt == 3 && computerSelection == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
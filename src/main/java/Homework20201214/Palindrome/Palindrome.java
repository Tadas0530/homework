package Homework20201214.Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String palindrome = scanner.nextLine();
        palindrome = palindrome.replaceAll("\\W", "");
        String[] characters = palindrome.split("");
        String[] charactersOpposite = new String[characters.length];

        int i = characters.length - 1;
        while (i >= 0) {
            charactersOpposite[(characters.length - 1) - i] = characters[i];
            i--;
        }

        boolean isMatching = false;
        for (i = 0; i < characters.length; i++) {
            if (characters[i].equalsIgnoreCase(charactersOpposite[i])) {
                isMatching = true;
            } else {
                isMatching = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isMatching + ".");
    }
}

package Homework20201214.Kartuves;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class KartuvesMain {
    public static void main(String[] args) throws IOException {

        String word = getRandomWord();
        String[] charsInWord = word.split("");
        String wordUnderscored = word.replaceAll(".", "_");
        System.out.println("Enter 0 to give up\nEnter your guess: ");
        System.out.println(wordUnderscored);
        String[] wordUnderscoredCurrent = wordUnderscored.split("");
        Scanner scanner2 = new Scanner(System.in);
        String wordGuess = null;
        int guessCount = 0;
        while (true) {
            wordGuess = scanner2.nextLine();
            if (wordGuess.equals("0")) {
                System.out.println("Game terminated");
                break;
            }
            if (wordGuess.length() == 1) {
                guessCount++;
                for (int i = 0; i < word.length(); i++) {
                    if (wordGuess.equalsIgnoreCase(charsInWord[i])) {
                        wordUnderscoredCurrent[i] = wordGuess;
                    }
                }
            } else if (wordGuess.equalsIgnoreCase(word)) {
                guessCount++;
                System.out.println("You have guessed correctly! In " + guessCount + " guesses!");
                break;
            } else {
                System.out.println("Please enter one character or correct word!");
            }
            System.out.println("Current state:");
            for (int j = 0; j < wordUnderscoredCurrent.length; j++) {
                System.out.print(wordUnderscoredCurrent[j]);
            }
        }
    }

    public static String getRandomWord() throws IOException {
        File files = new File("C:\\Users\\tadas\\OneDrive\\Stalinis kompiuteris\\words.txt");
        int count = 0;
        Scanner scanner = new Scanner(files);
        int r = 0;
        while (scanner.hasNextLine()) {
            String lines = scanner.nextLine();
            count++;
            Random random = new Random();
            r = random.nextInt(count);
        }
        String randomWord = Files.readAllLines(Paths.get("C:\\Users\\tadas\\OneDrive\\" +
                "Stalinis kompiuteris\\words.txt")).get(r);

        return randomWord;
    }
}
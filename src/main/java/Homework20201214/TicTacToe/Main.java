package Homework20201214.TicTacToe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, String> board = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static int selection = 10;
    private static String turn;

    public static void main(String[] args) {
        board.put(1, " ");
        board.put(2, " ");
        board.put(3, " ");
        board.put(4, " ");
        board.put(5, " ");
        board.put(6, " ");
        board.put(7, " ");
        board.put(8, " ");
        board.put(9, " ");
        System.out.println("Board range 1 - 9.");
        System.out.println("7 | 8 | 9");
        System.out.println("‾‾‾|‾‾‾‾|‾‾‾");
        System.out.println("4 | 5 | 6");
        System.out.println("‾‾‾|‾‾‾‾|‾‾‾");
        System.out.println("1 | 2 | 3");


        while (true) {
            playerTurn("X");

            if (hasWon("X")) {
                break;
            }
            if (isBoardFull()) {
                System.out.println("It's a draw.");
                break;
            }
            playerTurn("O");

            if (hasWon("O")) {
                break;
            }
            if (isBoardFull()) {
                System.out.println("It's a draw.");
                break;
            }
        }
    }

    public static void drawBoard() {
        System.out.println(board.get(7) + " | " + board.get(8) + " | " + board.get(9));
        System.out.println("‾‾‾|‾‾‾‾|‾‾‾");
        System.out.println(board.get(4) + " | " + board.get(5) + " | " + board.get(6));
        System.out.println("‾‾‾|‾‾‾‾|‾‾‾");
        System.out.println(board.get(1) + " | " + board.get(2) + " | " + board.get(3));
    }

    public static void playerTurn(String player) {
        try {
            System.out.println("Player " + player + " turn:");
            selection = scanner.nextInt();
            turn = player;
            if (board.get(selection).equals(" ")) {
                board.replace(selection, " ", player);
                drawBoard();
            } else {
                System.out.println("Box already has a value " + board.get(selection) + ".");
                int oldMove = selection;
                do {
                    playerTurn(player);
                }
                while (oldMove == selection);
            }
        } catch (NullPointerException e) {
            System.out.println("Wrong move!");
            System.out.println("Board range 1 - 9.");
            System.out.println("7 | 8 | 9");
            System.out.println("‾‾‾|‾‾‾‾|‾‾‾");
            System.out.println("4 | 5 | 6");
            System.out.println("‾‾‾|‾‾‾‾|‾‾‾");
            System.out.println("1 | 2 | 3");
            playerTurn(turn);
        }
    }

    public static boolean hasWon(String player) {
        boolean victory = false;
        int[][] victoryPattern = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9},
                {1, 5, 9},
                {7, 5, 3}
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(victoryPattern[i][j]).equals(player)) {
                    victory = true;
                } else {
                    victory = false;
                    break;
                }
            }
            if (victory) {
                System.out.println("Player " + player + " has won.");
                break;
            }
        }
        return victory;
    }

    public static boolean isBoardFull() {
        boolean isFull = true;
        for (int i = 1; i < board.size() + 1; i++) {
            if (board.get(i).equals(" ")) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }
}
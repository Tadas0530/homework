package Homework20201214.CodingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HorseRacingDuals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of horses
        int d = Integer.MAX_VALUE;                // difference
        int p = Integer.MAX_VALUE;                // previousNumber
        int r;                                    // result
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int pi = in.nextInt(); // the strength of horse
            numbers.add(pi);
        }
        for (int i : numbers) {
            for (int j : numbers) {
                if (i != j) {
                    r = Math.abs(i - j);
                    d = Math.min(r, d);
                }
            }
        }

        System.out.println(d);
    }
}


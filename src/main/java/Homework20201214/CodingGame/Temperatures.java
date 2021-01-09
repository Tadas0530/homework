package Homework20201214.CodingGame;

import java.util.Scanner;

public class Temperatures {

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int distance;
        int result = 5526;
        int previousDistance = 5526;
        if(n == 0) {
            result = 0;
        }
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            distance = Math.abs(t);
            if (t < 0) {
                distance += 1;
            }
            if (t >= -273 && t <= 5526) {
                if (distance < previousDistance) {
                    result = t;
                    previousDistance = distance;
                }
            } else {
                System.err.println("Temperature has to be in range -273 to 5526. Input of: " + t + " ignored.");
            }
        }
        System.out.println(result);
    }
}

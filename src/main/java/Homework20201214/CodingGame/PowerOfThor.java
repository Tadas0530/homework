package Homework20201214.CodingGame;

import java.util.Scanner;

public class PowerOfThor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        int thorX = TX;
        int thorY = TY;
        if (!(TX >= 0 && TX <= 39 && TY >= 0 && TY <= 17)) {
            System.err.println("Wrong objects positions");
            return;
        }

        // game loop
        while (true) {
            // int remainingTurns = in.nextInt(); // The level of Thor's remaining energy,
            // representing the number of moves he can still make.
            String directionX, directionY, directionXY, action = "None";
            if (thorX > LX && thorY > LY) {
                // NW
                directionXY = "NW";
                action = directionXY;
                thorY -= 1;
                thorX -= 1;
            } else if (thorX < LX && thorY < LY) {
                // SE
                directionXY = "SE";
                action = directionXY;
                thorY += 1;
                thorX += 1;
            } else if (thorX > LX && thorY < LY) {
                // SW
                directionXY = "SW";
                action = directionXY;
                thorY += 1;
                thorX -= 1;
            } else if (thorX < LX && thorY > LY) {
                // NE
                directionXY = "NE";
                action = directionXY;
                thorY -= 1;
                thorX += 1;
            } else if (thorX > LX) {
                directionX = "W";
                action = directionX;
                thorX -= 1;
            } else if (thorX < LX) {
                directionX = "E";
                action = directionX;
                thorX += 1;
            } else if (thorY > LY) {
                directionY = "N";
                action = directionY;
                thorY -= 1;
            } else if (thorY < LY) {
                directionY = "S";
                action = directionY;
                thorY += 1;
            }
            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(action);
            if (thorX < 0 || thorX > 39 || thorY < 0 || thorY > 17) {
                System.out.println("Thor moved outside the map. Game over.");
                break;
            }
            if (thorX == LX && thorY == LY) {
                break;
            }
        }
    }
}

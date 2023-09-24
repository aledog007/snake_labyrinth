package pv.af;
import java.awt.Point;
import java.util.Scanner;

class Snake {
    private SnakeGameCallback callback;
    private String name; // Player's name "name" is a variable

    public Snake(SnakeGameCallback callback, String name) {
        this.callback = callback;
        this.name = name;
    }

    // Start of the game with play reference to Line 31
    public void play() {
        // Create objects and game field
        Point playerPosition = new Point(10, 9);
        Point snakePosition = new Point(20, 2);
        Point goldPosition = new Point(6, 6);
        Point doorPosition = new Point(2, 5);
        boolean continueGame = true;
        boolean collectedGold = false;

        // Create a 10x40 game field
        while (continueGame) {
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 40; x++) {
                    Point p = new Point(x, y);
                    if (p.equals(playerPosition))
                        System.out.print("P");
                    else if (p.equals(snakePosition))
                        System.out.print("S");
                    else if (p.equals(goldPosition))
                        System.out.print("G");
                    else if (p.equals(doorPosition))
                        System.out.print("D");
                    else
                        System.out.print(".");
                }
                System.out.println();
            }

            if (snakePosition.equals(playerPosition)) {
                continueGame = false;
                callback.onGameLoss(name); // Callback for game loss, previously defined in Main -> Lines 12 -14
            }

            if (playerPosition.equals(goldPosition)) {
                collectedGold = true;
                goldPosition = new Point(-1, -1);
            }
            if (playerPosition.equals(doorPosition) && collectedGold) {
                continueGame = false;
                callback.onGameWin(name); // Callback for game win, previously defined in Main -> Lines 12 - 14
            }

            playerMovement(playerPosition);
            snakeMovement(snakePosition, playerPosition);
        }
    }

    private static void snakeMovement(Point snakePosition, Point playerPosition) {
        if (playerPosition.x < snakePosition.x)
            snakePosition.x--;
        else if (playerPosition.x > snakePosition.x)
            snakePosition.x++;
        if (playerPosition.y < snakePosition.y)
            snakePosition.y--;
        else if (playerPosition.y > snakePosition.y)
            snakePosition.y++;
    }

    public static void playerMovement(Point playerPosition) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        // Movement w, a, s, d
        if (input.equals("w")) {
            if (playerPosition.y > 0)
                playerPosition.y--;
        } else if (input.equals("s")) {
            if (playerPosition.y < 9)
                playerPosition.y++;
        } else if (input.equals("a")) {
            if (playerPosition.x > 0)
                playerPosition.x--;
        } else if (input.equals("d")) {
            if (playerPosition.x < 39)
                playerPosition.x++;
        }
    }
}
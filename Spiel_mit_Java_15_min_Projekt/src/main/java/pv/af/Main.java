package pv.af;
import java.awt.*;
import java.util.Scanner;

// Define callback functions here
interface SnakeGameCallback {
    void onGameWin(String name);
    void onGameLoss(String name);
}

public class Main implements SnakeGameCallback {
    public static void main(String[] args) {
        // Create objects and variables as below, but save input
        Scanner scanner = new Scanner(System.in);

        // Process user input and store it in "name"
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Create Snake game object and make the callback
        Snake snakeGame = new Snake(new Main(), name);

        // Start the game, see line 15 in Snake
        snakeGame.play();
    }

    @Override // Override indicates that a method actually overrides an existing method in a parent class or interface.
    public void onGameWin(String name) {
        // Output on game win
        System.out.println("\nMY FRIEND, " + name + " YOU HAVE WON!");
    }

    @Override
    public void onGameLoss(String name) {
        // Output on game loss
        System.out.println("\nZzzzz the snake bit " + name);
    }
}
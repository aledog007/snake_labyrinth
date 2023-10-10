# snake_maze
A littel fun Java game for the terminal 

Game Description:
The Java program is a simple console game developed entirely in Java. It is a text-based Snake game where the user enters their name, plays the game, and receives different outputs depending on the outcome of the game. The game consists of a game board with a player, a snake, gold, and a door. The objective of the game is to collect the gold and then reach the door without being bitten by the snake.

Java:
The game has been developed using the Java programming language, which is a widely-used, cross-platform programming language. Java allows the creation of applications that can run on various operating systems and is well-suited for developing console applications like this game.

Functions:

Enter Name: You, as the user, will be prompted to enter your name. This is done using the Scanner class to read user input.

Play the Game: The game starts after you enter your name. You control a game character on the game board and must collect gold and reach the door without being bitten by the snake. Control is done using the "w" key (move up), "s" key (move down), "a" key (move left), and "d" key (move right).

Different Outputs on Win and Loss: If you win the game, the output "MY FRIEND, [Name] YOU HAVE WON!" will be displayed, where [Name] will be replaced with the name you entered. In case of a loss, the output "Zzzzz the snake bit [Name]" will be displayed. This is achieved through callback functions defined in the Main class and called within the Snake class.

To try out the game, you can download the Java code shown above and run it in a Java development environment. The game will run in the terminal (command-line window) and provide a simple text-based entertainment for you as the play

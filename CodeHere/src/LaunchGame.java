import java.util.Scanner;

class Guesser {
     private Scanner sc = new Scanner(System.in);

    int guessNumber() {
        System.out.println("Guesser, guess a number between 1-10:");
        return sc.nextInt();
    }
}

class Player {
    private Scanner sc = new Scanner(System.in);

    int guessNumber(String playerName) {
        System.out.println(playerName + ", guess a number:");
        return sc.nextInt();
    }
}

class Umpire {
    private Guesser guesser = new Guesser();
    private Player player1 = new Player();
    private Player player2 = new Player();
    private Player player3 = new Player();

    public int guesserNumber;
    private int player1Number;
    private int player2Number;
    private int player3Number;

    void inputNumbers() {
        guesserNumber = guesser.guessNumber();

        player1Number = player1.guessNumber("Player 1");
        player2Number = player2.guessNumber("Player 2");
        player3Number = player3.guessNumber("Player 3");
    }

    void compare() {
        if (guesserNumber == player1Number && guesserNumber == player2Number && guesserNumber == player3Number) {
            System.out.println("All players won the game!");
        } 
        else if (guesserNumber == player1Number && guesserNumber == player2Number) {
            System.out.println("Player 1 and Player 2 won the game!");
        } 
         else if (guesserNumber == player1Number && guesserNumber == player3Number) {
            System.out.println("Player 1 and Player 3 won the game!");
        }  
         else if (guesserNumber == player2Number && guesserNumber == player3Number) {
            System.out.println("Player 2 and Player 3 won the game!");
        } 
       else if (guesserNumber == player1Number) {
            System.out.println("Good job, Player 1 won the game!");
        } 
       else if (guesserNumber == player2Number) {
            System.out.println("Good job, Player 2 won the game!");
        } else if (guesserNumber == player3Number) {
            System.out.println("Good job, Player 3 won the game!");
        } else {
            System.out.println("Game lost.");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
         Umpire umpire = new Umpire();

        while (true) {
            umpire.inputNumbers();

            if (umpire.guesserNumber < 1 || umpire.guesserNumber > 10) {
                System.out.println("Please enter a number between 1-10 next time. The program will now exit.");
                break;
            }

            umpire.compare();
            System.out.println("***********************************");
        }
    }
}

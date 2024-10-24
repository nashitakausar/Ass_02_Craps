import java.util.Random;
import java.util.Scanner;

public class CrapsGame {

    public static void Main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        boolean anotherRound = true;

        while (anotherRound) {
            System.out.println("Rolling the dice...");
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

            if (sum==2 || sum==3 || sum==12) {
                System.out.println("You lost, you crapped out with " + sum);
            } else if (sum==7 || sum==11) {
                System.out.println("You won, you rolled a natural " + sum);
            } else {
                System.out.println("The point is now " + sum + ". Continue rolling.");
                int point = sum;
                boolean gameOn = true;

                while (gameOn) {
                    System.out.println("Rolling the dice...");
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    int newSum = die1 + die2;

                    System.out.println("You rolled " + die1 + " + " + die2 + " = " + newSum);

                    if (newSum == 7) {
                        System.out.println("Your roll is a 7, you lose.");
                        gameOn = false;
                    } else if (newSum == point) {
                        System.out.println("You won, you made the point with " + newSum +);
                        gameOn = false;
                    } else {
                        System.out.println("Trying to make point. You rolled " + newSum + ". Try rolling again!");
                    }
                }
            }

            System.out.print("Do you want to play another round?(yes/no): ");
            String response = sc.next().toLowerCase();
            anotherRound = response.equals("yes");
        }

        System.out.println("Thank you for playing!");
    }
}

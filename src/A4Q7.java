
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        int position = 1;
        while (position < 100) {
            // ask for the sum of the dice
            System.out.println("Enter sum of the dice:");
            int dice = input.nextInt();

            // if sum is 0, terminate
            if (dice == 0) {
                System.out.println("YOU WIN!");
                break;
            }

            // move up however many spaces the sum of the dice is adn tell player
            position = position + dice;
            // when moving to the last square tell them they win and terminate
            if (dice == 100) {
                System.out.println("YOU WIN!");
            } else if (dice < 100) {
                System.out.println("You are now on square " + position);
            }
            // snakes:
            //  54 sends the player to 19
            if (position == 54) {
                position = 19;
                //  90 sends the player to 48
            } else if (position == 90) {
                position = 48;
                //  99 sends the player to 77    
            } else if (position == 99) {
                position = 77;
            }
            // ladders:
            //  9 sends a player to 34
            if (position == 9) {
                position = 34;
                //  40 sends a player to 64
            } else if (position == 40) {
                position = 64;
                //  67 sends a player to 86
            } else if (position == 67) {
                position = 86;
            }
        }

    }
}

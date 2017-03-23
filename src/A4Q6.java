
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask for current speed
        System.out.println("Enter the speed limit:");
        int limit = input.nextInt();
        // ask fro speed limit
        System.out.println("Enter the recorded speed of the car:");
        int speed = input.nextInt();

        // if they aren't speeding
        if (speed < limit) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            // if speed > limit say what the charge is for the amount over the limit they are
            if (speed < limit + 20) {
                System.out.println("You are speeding and your fine is $100.");
            } else {
                if (speed > limit + 21 && speed < limit + 30) {
                    System.out.println("You are speeding and your fine is $270.");
                } else {
                    if (speed > limit + 31) {
                        System.out.println("You are speeding and your fine is $500.");
                    }
                }
            }
        }
    }
}

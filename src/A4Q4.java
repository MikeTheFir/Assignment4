
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask for costs
        System.out.println("How much does the food for prom cost? :");
        double money1 = input.nextInt();
        System.out.println("How much does the DJ cost? :");
        double money2 = input.nextInt();

        System.out.println("How much does it cost to rent the hall? :");
        double money3 = input.nextInt();
        System.out.println("How much does decorations cost? :");
        double money4 = input.nextInt();

        System.out.println("How much does it cost for staff? :");
        double money5 = input.nextInt();
        System.out.println("How much for miscellaneous costs? : ");
        double money6 = input.nextInt();

        // add money
        double total = Math.ceil(money1 + money2 + money3 + money4 + money5 + money6);

        // find amount of tickets needed to sell
        double even = Math.ceil(total / 35);

        //say whats needed to break even
        System.out.println("The total cost is $" + total + ". You will need to sell " + even + " tickets to break even.");

    }
}

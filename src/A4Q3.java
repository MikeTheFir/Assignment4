
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask for numbers
        System.out.println("Please enter in 4 numbers on separate lines:");

        // get numbers
        double number1 = input.nextInt();
        double number2 = input.nextInt();
        double number3 = input.nextInt();
        double number4 = input.nextInt();

        // say numbers
        System.out.println("Your numbers were " + number1 + "," + number2 + "," + number3 + " and " + number4);

    }
}

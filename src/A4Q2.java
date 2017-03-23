
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask for measurement they want to convert
        System.out.println("Please enter the measurement in inches you wish to convert:");

        // get the measurement
        int inches = input.nextInt();

        // get the conversion
        int measurement = (int) (2.54 * inches);

        // tell the converted measurement
        System.out.println(inches + " inches is the same as " + measurement + " cm");
    }
}

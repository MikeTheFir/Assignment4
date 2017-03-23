
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // asking their name
        System.out.println("Please enter your name:");

        // scanning name into a variable
        String name2 = input.nextLine();

        //say hi
        System.out.println("Hello " + name2 + ". How are you today?");

    }
}


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");

        // scanning name into a variable
        String name = input.nextLine();

        // ask for test score and what you got
        System.out.println("What mark was the first test out of?:");
        double test1 = input.nextInt();
        System.out.println("What mark did you get?:");
        double got1 = input.nextInt();

        // ask for test score and what you got
        System.out.println("What mark was the second test out of?:");
        double test2 = input.nextInt();
        System.out.println("What mark did you get?:");
        double got2 = input.nextInt();

        // ask for test score and what you got
        System.out.println("What mark was the third test out of?:");
        double test3 = input.nextInt();
        System.out.println("What mark did you get?:");
        double got3 = input.nextInt();

        // ask for test score and what you got
        System.out.println("What mark was the fourth test out of?:");
        double test4 = input.nextInt();
        System.out.println("What mark did you get?:");
        double got4 = input.nextInt();

        // ask for test score and what you got
        System.out.println("What mark was the fifth test out of?:");
        double test5 = input.nextInt();
        System.out.println("What mark did you get?:");
        double got5 = input.nextInt();

        // find % for each test
        double score1 = (got1 / test1) * 100;
        double score2 = (got2 / test2) * 100;
        double score3 = (got3 / test3) * 100;
        double score4 = (got4 / test4) * 100;
        double score5 = (got5 / test5) * 100;

        // give test scores
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + score1 + "%");
        System.out.println("Test 2: " + score2 + "%");
        System.out.println("Test 3: " + score3 + "%");
        System.out.println("Test 4: " + score4 + "%");
        System.out.println("Test 5: " + score5 + "%");

        // add scores get average
        double total = (score1 + score2 + score3 + score4 + score5) / 5;

        // find %
        System.out.println("Average " + total + "%");
    }
}

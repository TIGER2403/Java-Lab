/* WAP to print a table of any number n where n is +ve integer and user input*/
import java.util.Scanner;
public class Prog2_29_08_2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Please enter a positive integer!");
        }

        sc.close();
    }
    
}

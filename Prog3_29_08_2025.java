/*WAP to calculate the lenth of any number input by user */
import java.util.Scanner;
public class Prog3_29_08_2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        num = Math.abs(num);
        int length = String.valueOf(num).length();
        System.out.println("Length of the number: " + length);
        sc.close();
    }
    
}

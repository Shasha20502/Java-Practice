package day1;

/*
Problem:
Find the factorial of a given number using loops.
Example:
Input → 5
Output → 120 (5×4×3×2×1)
 */

import java.util.Scanner;

public class Factorial {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fac = 1;

        for (int i = num; i > 0 ; i--) {
            fac = fac * i;
        }

        System.out.println("Factorial: " + fac);
    }
}

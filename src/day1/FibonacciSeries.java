package day1;

/*
Print the Fibonacci series up to N terms.
Example:
Input → 10
Output → 0 1 1 2 3 5 8 13 21 34
 */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " , " + b);

        for (int i = 2; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" , " + c);
        }
    }
}

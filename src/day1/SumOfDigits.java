package day1;

/*
Problem:
Find sum of digits of a given integer.
Example:
Input → 987
Output → 9+8+7 = 24
 */

import java.util.Scanner;

public class SumOfDigits {

    public static int countNum(int num) {
        int size = 0;
        while(num != 0) {
            size++;
            num /= 10;
        }
        return size;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int size = countNum(num);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of the digits: " + sum);
    }
}

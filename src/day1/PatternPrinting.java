package day1;

/*
Problem:
Print the following pattern using loops:
*
**
***
****
*****
 */

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
        }
    }
}

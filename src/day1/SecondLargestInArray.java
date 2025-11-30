package day1;

/*
Find the second-largest number in an array.
Example:
Input → [10, 4, 6, 20, 15]
Output → 15
 */

public class SecondLargestInArray {
    public static void main() {
        int[] arr = {10,4,6,20,15};
        int lar = 0;
        int secLar = 0;
        for (int j : arr) {
            if (j > lar) {
                lar = j;
            }
        }

        for (int j : arr) {
            if (j > secLar && j < lar) {
                secLar = j;
            }
        }
        System.out.println(secLar);

    }
}

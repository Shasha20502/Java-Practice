package day1;

/*
Problem:
Check whether a number is a palindrome.
        (A number is palindrome if it remains the same when reversed.)
Example:
Input → 121
Output → "Palindrome"
Input → 123
Output → "Not Palindrome"
*/

public class PalindromeNumber {

    public static int countSize(int num) {
        int size = 0;
        while(num != 0) {
            num = num/10;
            size++;
        }
        System.out.println(size);
        return size;
    }

    public static int reverseNum(int num, int size) {
        int rev = 0;
        for (int i = 0; i < size; i++) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println(rev);
        return rev;
    }

    public static void main() {
        int num = 121;
        int size = countSize(num);
        int reverse = reverseNum(num, size);

        if(num == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}

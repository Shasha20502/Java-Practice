package day1;

/*
Problem:
Write a program to reverse a given string without using built-in reverse() method.
Example:
Input → "ankisha"
Output → "ahsikna"
 */

public class ReverseString {
    public static void main() {
        String str = "Ankisha";
        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        StringBuilder strrev = new StringBuilder(str);
        strrev.reverse().toString();
        System.out.println(strrev);
    }
}


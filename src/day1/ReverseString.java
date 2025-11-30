package day1;

/*
Problem:
Write a program to reverse a given string without using built-in reverse() method.
Example:
Input → "ankisha"
Output → "ahsikna"
 */

public class ReverseString {
    public static void main(String[] args) {

        String str = "ankisha";
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        System.out.println("Reversed: " + rev);
    }
}


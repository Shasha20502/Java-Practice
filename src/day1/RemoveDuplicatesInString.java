package day1;

/*
Problem:
Remove repeated characters from a string and print only unique characters.
Example:
Input → "banana"
Output → "ban" or "bna" (order acceptable)
 */

public class RemoveDuplicatesInString {
    public static void main() {
        String str = "anna";
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i,i+1);
            if(!newStr.toString().contains(c)) newStr.append(c);
        }
        System.out.println(newStr);
    }
}

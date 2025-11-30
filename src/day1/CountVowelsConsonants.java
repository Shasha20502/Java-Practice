package day1;

/*
Problem:
Count the number of vowels and consonants in a string.
Example:
Input → "automation"
Output → Vowels=6, Consonants=4
 */

public class CountVowelsConsonants {
    public static void main() {
        String str = "automation";
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels ++;
            } else {
                consonants ++;
            }

        }

        System.out.println("Vowels found: " + vowels);
        System.out.println("Consonants found: " + consonants);

    }
}

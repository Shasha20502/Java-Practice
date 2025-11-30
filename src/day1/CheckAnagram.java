package day1;

/*
Check whether two strings are anagrams or not.
(Anagram means same characters, different order)
Example:
Input → "listen" & "silent"
Output → "Anagram"
 */

public class CheckAnagram {
    public static void main() {
        String str1 = "night";
        String str2 = "thing";

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
            return;
        }

        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();

        for (int i = 0; i < str1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) {
                if (strArr1[i] == strArr2[j]) {
                    strArr2[j] = '0';
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
                return;
            }
        }

        System.out.println(str1 + " and " + str2 + " are anagrams.");
    }
}

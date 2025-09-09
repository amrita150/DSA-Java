/*
Problem: Count Occurrences of Anagrams
Given a text and a pattern, count the number of occurrences of the pattern’s anagrams in the text.
Example:
Input: txt = "forxxorfxdofr", pat = "for"
Output: 3
*/

import java.util.*;

class CountOccOfAnagram {

    public static int search(String pat, String txt) {
        int i = 0, j = 0;
        int k = pat.length();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int z = 0; z < pat.length(); z++) {
            hm.put(pat.charAt(z), hm.getOrDefault(pat.charAt(z), 0) + 1);
        }

        int occ = hm.size();
        int count = 0;

        while (j < txt.length()) {
            char ch = txt.charAt(j);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
                if (hm.get(ch) == 0) {
                    occ--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (occ == 0) {
                    count++;
                }
                if (hm.containsKey(txt.charAt(i))) {
                    if (hm.get(txt.charAt(i)) == 0) {
                        occ++;
                    }
                    hm.put(txt.charAt(i), hm.get(txt.charAt(i)) + 1);
                }
                i++;
                j++;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {

        String txt = "forxxorfxdofr";
        String pat = "for";

        int result = search(pat, txt);
        System.out.println("Count of occurrences: " + result);
    }
}
